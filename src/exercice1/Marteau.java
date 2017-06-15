package exercice1;

public class Marteau {

	//attributs
	private boolean disponible;
	//unique instance
	private static Marteau INSTANCE;
	
	//privatisation du constructeur
	private Marteau(){}
	
	//méthode d'accès à l'instance
	public static Marteau getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Marteau();
		}
		return INSTANCE;
	}
	
	//Getters & Setters
	public static Marteau getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(Marteau iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
