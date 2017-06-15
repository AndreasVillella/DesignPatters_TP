package exercice1;

public abstract class Schtroumpf implements Runnable {
	
	private static String nom;
	
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
		
	
	
	//Getters & Setters
	public static String getNom() {
		return nom;
	}
	
	public static void setNom(String nom) {
		Schtroumpf.nom = nom;
	}	
	
}
