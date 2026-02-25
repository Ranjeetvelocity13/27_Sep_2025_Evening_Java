package Day_13_25_10_14_Revision;

// Class Example3 demonstrating parameterized and return-type methods
public class Example3 {

	public static void main(String[] args) {
		
		// Object creation to access non-static methods
		Example3 E3 = new Example3();
		
		// Calling a non-static method with a parameter
		E3.studentName("Rohit");
		
		// Calling a non-static method that returns a value
		int result = E3.addNumbers(10, 5);
		
		// Printing the returned result
		System.out.println("Addition Result : " + result);
	}

	// Non-static method with a parameter (takes name as input and prints it)
	public void studentName(String name) {
		System.out.println("Student Name : " + name);
	}
	
	// Non-static method with parameters and return type (adds two numbers and returns result)
	public int addNumbers(int a, int b) {
		return a + b;  // returns the sum of a and b
	}
}
