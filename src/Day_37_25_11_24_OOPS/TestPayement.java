package Day_37_25_11_24_OOPS;

public class TestPayement {

	int test =10;
	
	public static void main(String[] args) {

		
		Payment P1 = new GooglePay();
	
		P1.showMessage();
		P1.pay();
		
		Payment P2 =new PhonePay();
		P2.showMessage();
		P2.pay();
	}
	
	


}
