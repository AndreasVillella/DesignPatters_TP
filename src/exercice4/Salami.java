package exercice4;

public class Salami extends DecorateurIngredient {

	public Salami(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+" "+getDescription()+", salami";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+1.50f;
    }
    
}
