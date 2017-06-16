package exercice4;

public class JambonHalal extends DecorateurIngredient {

	public JambonHalal(Pizza p){
		pizza=p;
	}
	
	public String getNom(){
		return pizza.getNom()+", jambon halal : hamdoulilah";
    }
    
    public float getPrix(){
    	return pizza.getPrix()+3.50f;
    }
}
