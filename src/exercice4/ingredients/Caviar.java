package exercice4.ingredients;

import exercice4.decorateurs.DecorateurIngredient;
import exercice4.pizza.Pizza;

public class Caviar extends DecorateurIngredient {

	public Caviar(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+" au caviar qui coûte la peau du c*l";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+378.40f;
    }
    
    public String getIngredientBase(){
		return "250g de caviar"; 	
    }
}
