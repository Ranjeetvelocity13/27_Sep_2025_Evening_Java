package Day_12_25_10_13_Revision;

public class Example4 {

	public static void main(String[] args) {

		System.out.println("Program started");
		//A method is a block of code that perform a specific task
		// it helps in code reusability and readability
		
		//Types 
		// pre-define /built in method  - print, length(), szie(),squrt()
		
		// User define /regualr method
		
		//User define method 
		//1. static method
		//2. Non static method
		
		Demo1();
		Demo2();
		
		System.out.println("------------------------");
		//Second way -
		// ClassName.methodname();
		Example4.Demo1();
		Example4.Demo2();
	
		//calling static method
		System.out.println("------------------------");

		//Calling method feom different class
		Example5.Test1();
		Example5.Test2();
		
		System.out.println("Program ended");
		//direct calling
		//methodName();

	}
	
//	public static void methodname() {
//		
//		
//	}
	
	public static void  Demo1() {
	
		System.out.println("Welcome to java revision");
	}

	
	public static void  Demo2() {
		
		System.out.println("Welcome to automation Testing");
	}

}
