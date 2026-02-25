package Day_15_25_10_16_LoopingStatement;

public class Example1 {

	public static void main(String[] args) {
	
		//bank loan approval
		
		int creditScore =  650;
		double income = 50000;
		
	
		if(creditScore >= 750) { //false 
			
			if(income >= 60000) { //flase
				
				System.out.println("Loan approval");
			}
			else {
				
				System.out.println("loan rejected");
			}
		}
		else {
			System.out.println("credit score is low");
		}
	}

}
