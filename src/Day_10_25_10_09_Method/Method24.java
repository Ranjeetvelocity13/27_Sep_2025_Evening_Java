package Day_10_25_10_09_Method;

public class Method24 {

	public static void main(String[] args) {

		// Can we call a method inside another method in Java?
		// Yes, we can call a method inside another method.

		Method24.welcome();
		Method24.greetMessage();
	}
	
	public static void greet() {
		System.out.println("Good morning");
		Method24.welcome();
	}
	
	public static void welcome() {
		System.out.println("Welcome to VCTC");
		Method24.greet();
	}
	
	public void sayHello() {  // Non-static
		System.out.println("Hello Everyone");
	}
	
	public static void greetMessage() {  // Static
		Method24 m24 = new Method24();
		m24.sayHello();
		System.out.println("Welcome to Java classes");
	}
}
