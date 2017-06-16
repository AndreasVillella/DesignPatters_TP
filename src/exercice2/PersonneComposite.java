package exercice2;

import java.util.ArrayList;

public class PersonneComposite implements Personne{
	
	private ArrayList<Personne> ListPersonne = new ArrayList<Personne>();
	
	public void add(Personne personne)  {
		ListPersonne.add(personne);
	}
	
	public void remove(Personne personne)  {
		ListPersonne.remove(personne);
	}

	@Override
	public void print() {
		for (Personne personne : ListPersonne) {
			personne.print();
		}
		
	}

	//Add Remove Delete Se marier
	public void seMarier(){
		
	}
}
