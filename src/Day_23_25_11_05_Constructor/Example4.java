package Day_23_25_11_05_Constructor;

public class Example4 {

	
	/*constructor and method
	constructor - A special block of code used to initialized an object whe it is created
	it is called automatically at the time of object creation using new keyword
	
	//Method 
	A block of code used to perform a specific task or operation
	it must be called explicitly using an object or class name
	
	
	*/
	
	public Example4() {
		
		System.out.println("Constructor called");
	}
	
	public void displyed() { //Method
		
		
		System.out.println("Method called");
		
	}

	public static void main(String[] args) {
		
		
		Example4 e4 = new Example4();
		e4.displyed();
		

	}
	

}
