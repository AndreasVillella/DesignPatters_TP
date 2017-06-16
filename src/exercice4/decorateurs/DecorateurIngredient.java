package exercice4.decorateurs;

import exercice4.pizza.Pizza;

public abstract class DecorateurIngredient extends Pizza {

	protected Pizza pizza;

	public abstract String getNom();
	public abstract float getPrix();
	
}
