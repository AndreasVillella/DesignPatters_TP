package exercice4;

public class Four {

	private Four(){}
	
	private static Four INSTANCE = null;
	
	public static Four getInstance(){
		if(INSTANCE == null){
			INSTANCE = new Four();
		}
		return INSTANCE;
	}
}
