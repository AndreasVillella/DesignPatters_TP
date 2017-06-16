package exercice1;

public class Pont {

	//attributs
	private int nbCoupsMarteauNecessaires = 12;
	//unique instance
	private static Pont INSTANCE;
		
	//privatisation du constructeur
	private Pont(){}
		
	//méthode d'accès à l'instance
	public static Pont getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Pont();
		}
		return INSTANCE;
	}
	
	//Getters & Setters
	public static Pont getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(Pont iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

	public int getNbCoupsMarteauNecessaires() {
		return nbCoupsMarteauNecessaires;
	}

	public void setNbCoupsMarteauNecessaires(int nbCoupsMarteauNecessaires) {
		this.nbCoupsMarteauNecessaires = nbCoupsMarteauNecessaires;
	}
	

}
	

