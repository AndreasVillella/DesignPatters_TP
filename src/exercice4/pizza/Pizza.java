package exercice4.pizza;

import java.text.NumberFormat;

public abstract class Pizza {

	private String nom;
	private float prix;
	private int tempsCuisson;
	private String description;
	private String ingredientBase;
	
	// Méthode utilisée pour l'affichage d'un dessert.
    public String toString(){
    	NumberFormat format=NumberFormat.getInstance();
        format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
        return "Nom de la pizza : "+getNom()+
        		"\nIngrédient(s) : "+getIngredientBase()+
        		"\nPrix : "+format.format(getPrix())+"€";
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

	 
}
