package exercice4.pizza;

import java.text.NumberFormat;

public abstract class Pizza {

	private String nom;
	private float prix;
	private int tempsCuisson;
	private String description;
	private String ingredientBase;
	private boolean cuit;
	
	// Méthode utilisée pour l'affichage d'un dessert.
    public String toString(){
    	NumberFormat format=NumberFormat.getInstance();
        format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
        return "En plus d'être extrèmement chères, nos pizza sont immangeables :"+
        		"\n\nNom de la pizza : "+getNom()+
        		"\nIngrédient(s) : "+getIngredientBase()+
        		"\nPrix : "+format.format(getPrix())+"€"+
        		"\nTemps de cuisson : "+format.format(getTempsCuisson())+" minutes"
        		;
    }
		
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public int getTempsCuisson() {
		return tempsCuisson;
	}
	
	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getIngredientBase() {
		return ingredientBase;
	}
	
	public void setIngredientBase(String ingredientBase) {
		this.ingredientBase = ingredientBase;
	}

	public boolean isCuit() {
		return cuit;
	}

	public void setCuit(boolean cuit) {
		this.cuit = cuit;
	}
		 
}
