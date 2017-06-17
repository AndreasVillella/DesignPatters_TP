package exercice4;

import exercice4.ingredients.Caviar;
import exercice4.ingredients.JambonHalal;
import exercice4.ingredients.Poireau;
import exercice4.ingredients.Salami;
import exercice4.pizza.Margarita;
import exercice4.pizza.Pizza;

public class Main_q8 {

	public static void main(String[] args) {
		
		Pizzaiolo pizzaiolo = new Pizzaiolo();
		pizzaiolo.setInfos("La pizza n'est pas cuite");
		
		Pizza p1 = new Margarita();
		p1 = new Poireau(p1);
		p1.addObserver(pizzaiolo);
		
		System.out.print("Etat de la pizza :\nPizzaiolo: "+ pizzaiolo);
		
		Pizza p2 = new Margarita();
		p2 = new Caviar(p2);
		
		p2.addObserver(pizzaiolo);

		System.out.print("Etat de la pizza :\nPizzaiolo: "+ pizzaiolo);
		
		Pizza p3 = new Margarita();
		p3 = new Caviar(p3);
		p3 = new JambonHalal(p3);
		p3 = new Salami(p3);
		
		p3.setCuit(true);
		System.out.print("Etat de la pizza :\nPizzaiolo: "+ pizzaiolo);

	}

}
