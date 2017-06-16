package exercice1;

public abstract class Schtroumpf implements Runnable {
	
	//attributs
	private static String nom;
	Pont objectif;
	
	public Schtroumpf(String nom) {
		super();
		this.nom = nom;
	}
	
	public static String tape(Marteau marteau){
		Marteau.getInstance();
		String tape = "tape avec le marteau";
		return getNom()+tape; 
	}

	public static boolean prendMarteau(){
		Marteau m1 = Marteau.getInstance();
		
		if(m1.isDisponible()){
			m1.setDisponible(false);
			tape(m1);
			try {
				Thread.sleep(2000);
				m1.setDisponible(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prendMarteau();
	}
	
	public static String setOutil(){
		Marteau outil = Marteau.getInstance();
		String nom = Schtroumpf.getNom();
		return nom+"tiens le marteau";
	}	
	
	public void Run(){
		Pont p = Pont.getInstance();
		while(p.getNbCoupsMarteauNecessaires()>0){
			prendMarteau();
		}
	}
	
	//Getters & Setters
	public static String getNom() {
		return nom;
	}
	
	public static void setNom(String nom) {
		Schtroumpf.nom = nom;
	}

	public Pont getObjectif() {
		return objectif;
	}

	public void setObjectif(Pont objectif) {
		this.objectif = objectif;
	}	
	
}
