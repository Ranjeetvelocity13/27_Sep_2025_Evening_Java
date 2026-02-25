package Day_20_25_10_31_Typesofvaribales;

import java.time.temporal.TemporalAmount;

public class Example2 {

	
	static String BankName = "SBI";
	String accountHolderName;
	long accountNumber;
	double balance;
	final double InterstRate = 0.05;
	
	public void  creatAccount(String name, long accountnumber, double Balance) {
		
		accountHolderName = name;
		
		accountNumber = accountnumber;
		
		balance = Balance;
		
		System.out.println("Account created successfully");
		
		System.out.println("-----------------------");
	}
	
	//1000 + 500
	public void deposit(double amount) {
		
		balance = balance + amount;
		
		System.out.println("Deposit Traasection");
		
		System.out.println("Amount Depoisted ₹:"+ amount);
		
		System.out.println("Updated balance :₹"+ balance);
		
		System.out.println("-----------------------");
	}
	
	public void withdraw(double amount) {
		
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("Withdrawal of ₹ :"+ amount +"Successfully");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		System.out.println("Current balance :₹ "+ balance);
		System.out.println("----------------------");
		
	}
	
	public void calculateInterstRate() {
		
		double interset = balance * InterstRate;
		System.out.println("Yearly interest ₹:"+ interset);
		System.out.println("-----------------------------");
	}
	
	public static void BankInfomaration() {
		
		System.out.println("Welcome to "+ BankName);
		System.out.println("We are offerring saving and current accounts");
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {

		Example2.BankInfomaration();
		
		Example2 acc1  = new Example2();
		
		acc1.creatAccount("Rohit Sharma", 473737348487l, 10000 );
		
		acc1.deposit(3000);
		acc1.withdraw(2000);
		acc1.withdraw(20000);
		
		acc1.calculateInterstRate();
	}

}
