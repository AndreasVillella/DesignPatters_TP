package exercice4;

public class Poireau extends DecorateurIngredient {

	public Poireau(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+", poireau";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+0.50f;
    }
}
