package exercice2;

public class Femme implements Personne{
	
	String nom;
	String prenom;
	
	public Femme(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public void print() {
		System.out.printf(this.getNom(), this.getPrenom());
		
	}

}
