package exercice1;

public class Marteau {

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
}
