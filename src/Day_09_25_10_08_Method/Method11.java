package Day_09_25_10_08_Method;

public class Method11 {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		Method10 obj1 = new Method10();
		obj1.name1();
		obj1.name2();
//		obj1.Test1();
		
		Method11 obj2 = new Method11();
		obj2.Test1();
		obj2.Test2();
		
		System.out.println("Program Ended");

	}

	public void Test1() {
		
		System.out.println("Non static method test 1 calling from same class");
	}
	
	public void Test2() {
		
		System.out.println("Non static method test 2 calling from same class");
	}
}
