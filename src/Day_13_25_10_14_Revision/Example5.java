package Day_13_25_10_14_Revision;

// Example5 - Demonstrates static and non-static methods, variables, and return types
public class Example5 {

	// ---------------- Static & Non-static Variables ----------------
	static String instituteName = "Velocity Corporate Training Center"; // Static variable
	String studentName = "Virat"; // Non-static variable

	
	// ---------------- Static Method ----------------
	public static void displayMessage() {
		System.out.println("Welcome to Java Revision Session!");
	}
	
	
	// ---------------- Non-static Method ----------------
	public void showStudentDetails() {
		System.out.println("Student Name : " + studentName);
	}
	
	
	// ---------------- Non-static Method with Parameters and Return Type ----------------
	public int calculateMarks(int sub1, int sub2, int sub3) {
		int total = sub1 + sub2 + sub3; // Adding three subject marks
		return total; // Returning total marks
	}
	
	
	// ---------------- Main Method (Program Execution Starts Here) ----------------
	public static void main(String[] args) {
		
		System.out.println("Java Revision : Variables, Data Types, Methods, Operators");
		
		// ---------------- Local Variables ----------------
		int a = 10;
		int b = 5;
		double marks = 85.4;
		char grade = 'A';
		boolean isPass = true;
		
		// Accessing static variable directly (no object needed)
		System.out.println("Institute Name : " + instituteName);
		
		// Displaying multiple variable values
		System.out.println("Marks : " + marks + " | Grade : " + grade + " | Pass : " + isPass);
		
		
		// ---------------- Calling Static Methods ----------------
		displayMessage(); // Can be called directly inside same class
		Example5.displayMessage(); // Or using class name
		
		
		// ---------------- Creating Object for Non-static Methods ----------------
		Example5 obj = new Example5();
		
		// Calling non-static method using object reference
		obj.showStudentDetails();
		
		
		// ---------------- Calling Method with Return Type ----------------
		int total = obj.calculateMarks(10, 20, 30);
		System.out.println("Total Marks : " + total);
	}
}
