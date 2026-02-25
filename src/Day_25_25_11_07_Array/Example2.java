package Day_25_25_11_07_Array;

public class Example2 {

	public static void main(String[] args) {

		
		//1.for each loop Syntax
		
//		for(dataType variablename : array_or_collection) {
//			
//		}
		
		int [] marks = {89,40,30,43,55};
		
		System.out.println("Marks of student");
		
		for(int mark : marks) {
			System.out.println(mark);
		}
		
		System.out.println("Loop completed");
		
		
		String [] names =  {"Java","Python","Ruby", "Javascript"};
		
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
		//Logical program
		
		int [] number = {12,7,19,3,25,28};
		
		System.out.println("Even numbers are");
		
		for(int i=0 ;i< number.length ;i++) {
			
			if(number[i] % 2 == 0) {
				System.out.println(number[i]);
			}
		}
		
		for(int num : number) {
			
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

}
