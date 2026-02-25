package Day_09_25_10_08_Method;

public class Method12 {

	public static void main(String[] args) {


//		method12.name2();
//		method12.name1();
		
		Method12 m12 = new Method12();
		
		//Can i access static method by using object name - Yes
		//Yes we can access static method but compiler will throw warning message
		m12.name1();
		
		m12.name2();
		
	}

	public void name1() {  //Non static method
		 
		System.out.println("Non Static method");
	}
	
	public static void name2() {  //Static method
		
		System.out.println("Static method ");
	}
}
