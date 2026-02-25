package Day_07_25_10_06_Method;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		//1.Direct calling - syntax - methodname();
		Demo1();
		Demo2();
		System.out.println("***************");
		
		//2. Calling by className.methodName();
		Method2.Demo1();
		Method2.Demo2();
	
		System.out.println("Main method ended");
		
	}
	
	//Static method
	
	public static void Demo1() {
		
		System.out.println("Static method Demo1");
		
	}
	
	public static void Demo2() {
		
		System.out.println("Static method Demo2");
	}

}
