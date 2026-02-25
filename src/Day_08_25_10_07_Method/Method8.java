package Day_08_25_10_07_Method;

public class Method8 {

	public static void main(String[] args) {

		
		System.out.println("Program started");
		
		//Object creation syntax
		//className objrefrencevariableName = new className();
		
		Method8 obj1 = new Method8();
		
		//objeferecevariableName.methodname();
		
		obj1.Test();
		
		System.out.println("Program Ended");
		
	}
	
	public void Test() {  //Non static method
		
		System.out.println("Non static method test");
		
	}

}
