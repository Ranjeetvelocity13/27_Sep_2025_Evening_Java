package Day_37_25_11_24_OOPS;

public abstract class Payment {
 
	//abstract - no implementaion (hidden)
	abstract void pay();
	
	
	public final void showMessage() {
		
		System.out.println("Payement is proiecessing");
	}
	
}
