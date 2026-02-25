package Day_37_25_11_24_OOPS;

public class Test {

	public static void main(String[] args) {


		Encapsulation en = new Encapsulation();
		
		en.setName("Rohit");
		en.setAge(25);
		
		
		System.out.println(en.getName());
		System.out.println(en.getAge());
		
		BankAccount BA =  new BankAccount();
		BA.deposit(1000);
		System.out.println("After deposit -->"+ BA.getBalance());
		
		BA.withdraw(300);
		System.out.println("After withdrawal -->"+ BA.getBalance());
		
		//Try with mote than bance 
		BA.withdraw(4000);
		System.out.println("After failed withodwawl -- >"+BA.getBalance());
		
		//System.out.println(BA.Balance); //
	}

}
