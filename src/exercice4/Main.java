package exercice4;

import exercice4.ingredients.Caviar;
import exercice4.ingredients.JambonHalal;
import exercice4.ingredients.Poireau;
import exercice4.ingredients.Salami;
import exercice4.pizza.Margarita;
import exercice4.pizza.Pizza;

public class Main {

	public static void main(String[] args){
	
		Pizza p1 = new Margarita();
		p1 = new Poireau(p1);
		
		Pizza p2 = new Margarita();
		p2 = new Caviar(p2);
		
		Pizza p3 = new Margarita();
		p3 = new Caviar(p3);
		p3 = new JambonHalal(p3);
		p3 = new Salami(p3);
		
		System.out.println(p1+"\n");
		System.out.println(p2+"\n");
		System.out.println(p3);
	}
}
