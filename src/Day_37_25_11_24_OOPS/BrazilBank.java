package Day_37_25_11_24_OOPS;

public interface BrazilBank {

	void carLoan();
	void MutualFunds();
	
	public static void Demo() {
		
		System.out.println("Static method inside interface");
		
	}
	
	default void Displayed() {
		System.out.println("Default method inside interface");
	}

}
