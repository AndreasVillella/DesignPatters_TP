package exercice4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

import exercice4.pizza.Pizza;

public class Pizzaiolo implements Observer {

	protected Pizza pizza;
	private String infos;
	
	public void update(Observable obs, Object obj) {
		if(obs instanceof Pizza){
			if(pizza.isCuit()==true){
				setInfos("La pizza est cuite");
			}
			setInfos("La pizza n'est pas cuite");
		}
	}
	
	public String getInfos() {
		return infos;
	}
	
	public void setInfos(String infos) {
		this.infos = infos;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
}

