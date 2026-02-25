package Day_13_25_10_14_Revision;

// Main class
public class Example1 {

	public static void main(String[] args) {
		
		// Program execution starts from the main() method
		System.out.println("Program started");
		
		// Non-static methods cannot be called directly from a static context (like main)
		// So, we need to create an object of the class to access them
		
		// Creating an object of Example1 class
		// Syntax: ClassName objectName = new ClassName();
		Example1 E1 = new Example1();
		
		// Calling non-static methods using the object reference
		E1.showName();   // Calls showName() method
		E1.Demo();       // Calls Demo() method
		
		// Creating an object of another class (Example2)
		Example2 E2 = new Example2();
		
		// Calling a method from Example2 class
		E2.name();
		
		System.out.println("Program ended");
	}
	
	// Non-static method 1
	public void showName() {
		System.out.println("Student Name : Rahul");
	}
	
	// Non-static method 2
	public void Demo() {
		System.out.println("Non static method demo 1");
	}
}
