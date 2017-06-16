package exercice4.ingredients;

import exercice4.decorateurs.DecorateurIngredient;
import exercice4.pizza.Pizza;

public class Fromage extends DecorateurIngredient {

	public Fromage(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+" au fromage";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+0.04f;
    }
    
    public String getIngredientBase(){
		return "Gruyère"; 	
    }
}
