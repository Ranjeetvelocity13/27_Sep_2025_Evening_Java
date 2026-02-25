package Day_22_25_11_04_Constructor;

public class Example9 {

	String name;
	int age;
	
	public Example9() {
		
		name = "Default name";
		age = 20;
	}
	
	public void show() {
		
		System.out.println("Name :"+ name +" Age :"+age);
		
		
	}
	
	public static void main(String[] args) {
		
		Example9 e9 = new Example9();
		e9.show();

	}

}
