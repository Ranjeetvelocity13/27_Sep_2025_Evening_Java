package Day_22_25_11_04_Constructor;

public class Example6 {

	//
	
	String name;
	int age;
	
	public Example6() {
		
		System.out.println("Example 6");
		
	}
	
	public Example6(int i) {
		
		System.out.println("Example 6 Test");
		
	}
	
	public static void main(String[] args) {

		Example6 e6 = new Example6();
		Example6 e7 = new Example6(10);
		
	}

}
