package exercice4.ingredients;

import exercice4.decorateurs.DecorateurIngredient;
import exercice4.pizza.Pizza;

public class Salami extends DecorateurIngredient {

	public Salami(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+" et salami";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+1.50f;
    }
    
    public String getIngredientBase(){
		return "5 tranches de salami"; 	
    }
    
}
