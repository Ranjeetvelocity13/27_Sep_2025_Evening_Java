package Day_35_25_11_20_OOPS;

public class Test {

	public static void main(String[] args) {

		Payment p; 
		
		 p = new CreditCard();   //Up casting -runtimeploye,dyamic binding
		 p.processPayement();  
		
		 p =  new UPI();
		 p.processPayement(); // 
		 
		 p = new NetBanking();
		 p.processPayement();  //
		
	}

}
