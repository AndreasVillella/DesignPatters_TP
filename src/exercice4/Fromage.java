package exercice4;

public class Fromage extends DecorateurIngredient {

	public Fromage(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+", fromage";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+0.04f;
    }
}
