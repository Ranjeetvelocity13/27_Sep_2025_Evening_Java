package Day_14_25_10_15_ConditionStatements;

public class Example3 {

	/*
	 if-else-if ladder
	 used to check multiple conditions in sequence
	 Once a true conditon is found the rest are skipped
	 Final else block acts as a default
	 
	 if (conition 1){
	   block 1
	 }
	 else if(condition 2){
	   //block 2  - if the condition is 2 is true and condtion1 is fasle
	 }
	 else if (condition 3){ 
	    block 3 - if the condition 3 is true is 1 or 2 false
	 }
	 esle{
	     default blcok
	 */
	
	public static void main(String[] args) {
		
      //Example 1 - Student grade
		
		int marks = 30;
		
		if (marks >= 90) {  //30 >= 90 - false 
			System.out.println("Grade : A+");
		}
		else if(marks >= 75) {  //30 >= 75 - false
			System.out.println("Grade :A");
		}
		else if(marks >= 60) {  //30 >= 60 - fasle
			System.out.println("Grade : B");
		}
		else if(marks >= 55) {  //30 >= 50 -false
			System.out.println("Grade :c");
		}
		else { 
			System.out.println("Pass");
		}
		
		//Eample 2 - Temperature level
		int  temp  = 25;
		
		if (temp >= 35) {  //false
			System.out.println("Hot");
		}
		else if(temp >= 30) {  //false
			System.out.println("Normal");
		}
		else {  
			System.out.println("Cold");
		}
		
		//Example 3 -Traffic signal
		
		String signal = "Red";
		
		if(signal == "Green") {
			System.out.println("Go");
		}
		else if(signal =="Yellow") {
			System.out.println("Slow down");
		}
		else if(signal == "Red"){
			System.out.println("Stop");
		}
		else {
			System.out.println("Invalid signal");
		}
		
		
		//Example 4 - Electricty bill
		
		int units = 250;
		
		if(units <= 100) {  //false
			
			System.out.println("Bill: Rs 3/units");
		}
		else if(units <= 200) {  //fasle
			System.out.println("Bill : Rs 4/units");
		}
		else { 
			System.out.println("Bill : Rs 5/units");
		}
	
	}
	


}
