package exercice2;

public class Main {

	public static void main(String[] args) {
		
		Homme h1 = new Homme("Villella","Andreas");
		Femme f1 = new Femme("Rouzé", "Aurelien");
		Enfant e1 = new Enfant("Kunis","Mila");
		
		PersonneComposite pc = new PersonneComposite();
		
		pc.add(h1);
		pc.add(f1);
		pc.add(e1);
			
		pc.print();
	}

}
