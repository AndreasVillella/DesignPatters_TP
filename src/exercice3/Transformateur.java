package exercice3;

public class Transformateur implements Chargeur, Runnable {
	Machine machine = new Machine();
	public void run() {
		try {
			while (true) {
			// toutes les secondes un boulanger produit un pain Thread.sleep(1000) ;
				boolean added = machine.depose(new Transformateur()) ;
				if (added) {
					System.out.println("[" + Thread.currentThread().getName() + "]" +
							"[" + machine.getStock() + "] je livre.") ;
				} 
				else{
					System.out.println("[" + Thread.currentThread().getName() + "]" +
							"[" + machine.getStock() + "] la boulangerie est pleine.") ;
				} 
			}
		}catch (InterruptedException e) {
			System.out.println("[" + Thread.currentThread().getName() + "] je m'arrête") ;
		}
	}
}