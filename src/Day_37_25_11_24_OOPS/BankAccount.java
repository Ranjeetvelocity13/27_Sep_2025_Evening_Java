package Day_37_25_11_24_OOPS;

public class BankAccount {

	
	private double Balance; //hidden
	
	
	public void deposit(double amount) {
		
		if(amount > 0) {
			Balance += amount;
			
		}
		

	}
	
	public void withdraw(double amount) {
		if(amount <= Balance && amount > 0) {
			Balance -= amount;
		}
	}
	
	public double getBalance() {
		return Balance;
	}
	
	
	//User can't directly change balance 
	//Only depotut and withdraw are allowed
}
