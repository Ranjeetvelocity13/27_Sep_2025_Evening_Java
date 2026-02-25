package Day_17_25_10_28_Revision;

public class Example4 {

	public static void main(String[] args) {

		
		//check eligibility for bank loan (Nested if)
		
		int age = 28;
		double income = 5000;
		
		if(age >= 21) {  //true
			
			if(income >= 40000) { //true
				
				System.out.println("Eligible for loan");
			}
			else {
				System.out.println("Not Eligible - Income too low");
			}
		}
		else {
			System.out.println("Not eligible - Age below 21");
		}
		
	}

}
