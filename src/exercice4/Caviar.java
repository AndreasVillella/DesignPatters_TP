package exercice4;

public class Caviar extends DecorateurIngredient {

	public Caviar(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+", caviar : c'est cher sa mère";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+19.50f;
    }
    
}
