package exercice2;

public class Main {

	public static void main(String[] args) {
		
		Homme h1 = new Homme("Villella", "Andreas");
		Femme f1 = new Femme("Tchoin", "Dorine");
		Enfant e1 = new Enfant("TchoinTchoin", "Tchoin");
		
		PersonneComposite pc = new PersonneComposite();
		
		
		pc.add(h1);
		pc.add(f1);
		
		Personne.add(pc);
		Personne.print();
		
		
		
		
		

	}

}
