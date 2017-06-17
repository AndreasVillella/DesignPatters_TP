package exercice4.ingredients;

import exercice4.decorateurs.DecorateurIngredient;
import exercice4.pizza.Pizza;

public class Poireau extends DecorateurIngredient {

	public Poireau(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+" au poireaux";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+0.50f;
    }

    public String getIngredientBase(){
		return "2 poireaux"; 	
    }
    
    public int getTempsCuisson(){
		return pizza.getTempsCuisson()+5;
	}
}
