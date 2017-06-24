package exercice3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Machine {

	// une machine est une file d'attente de 20 cases
	private BlockingQueue<Transformateur> queue = new ArrayBlockingQueue<Transformateur>(20) ;
	
	// on peut y déposer du pain, mais le boulanger n'est pas patient // si le panier de vente est plein, il s'en va
	public boolean depose(Transformateur transformateur) throws InterruptedException {
		return queue.offer(transformateur, 200, TimeUnit.MILLISECONDS) ; 
	}
	
	// on peut en acheter, et le client n'est pas plus patient // que le boulanger
	public Transformateur achete () throws InterruptedException {
		return queue.poll(200, TimeUnit.MILLISECONDS) ; 
	}
	
	// on peut interroger le stock
	public  int getStock() {
		return queue.size() ;
	}
}
