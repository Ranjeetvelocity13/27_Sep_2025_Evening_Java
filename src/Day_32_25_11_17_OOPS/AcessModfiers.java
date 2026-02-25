package Day_32_25_11_17_OOPS;

public class AcessModfiers {

	private int data = 100; 
	public int data1 = 101;
	
	int num = 10;  //Default
	
	public static void main(String[] args) {
	/*
	 * 
	 * The access modfiers in java  specifers the accessibility or scope 
	 * of the filed ,methods, constructor, class, variables we can change 
	 * level of fileds to accesss
	 * 
	 * Therrare four types of java access modifieres
	 * 1.Private - Accessible only within the same class
	 * 2.Default  - Accessible within the same package only
	 * 3.Protected
	 * 4.Public
	 */
		
		AcessModfiers AM = new AcessModfiers();
		AM.Demo();
		AM.Test();
		AM.msg();
		
		
		
	}
	
	private void Demo() {
		
		System.out.println(data);
		System.out.println("Private method");
	}

	public void Test() {
		System.out.println("Public method");
	}
	
	void msg() { //Default Method
		System.out.println(num);
		System.out.println("Default Method");
	}
}
