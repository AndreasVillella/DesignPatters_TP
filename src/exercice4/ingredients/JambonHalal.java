package exercice4.ingredients;

import exercice4.decorateurs.DecorateurIngredient;
import exercice4.pizza.Pizza;

public class JambonHalal extends DecorateurIngredient {

	public JambonHalal(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+", jambon halal hamdoulilah";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+3.50f;
    }
    
    public String getIngredientBase(){
		return "Du bon jambon halal"; 	
    }
    
    public int getTempsCuisson(){
		return pizza.getTempsCuisson()+1;
	}
}
