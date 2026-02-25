package Day_22_25_11_04_Constructor;

public class Example4 {

	//Constructors must not specify a return type (not even void). 
	//If you put a return type it becomes a regular method, not a constructor.

	
	public void Example4() {
		
		System.out.println("Example 4");
	}
	
	public static void main(String[] args) {

		Example4 e4 = new Example4();
		e4.Example4();
		
	}

}
