package Day_23_25_11_05_Constructor;

public class Example1 {

	//this  - you use this only when u need to diiferentiate b/w  local var and instance var(class /global var)
	
	
	String name;
	int age;
	
	public Example1(String name, int age ) {
		
		this.name = name;
		this.age  = age;
		
	}
	
	public void show() {
		
		System.out.println("Name : "+ name +" Age : "+age);
	}
	
	public static void main(String[] args) {
	
		Example1 e1 = new Example1("Rohit",20);
		
        e1.show();
	}

}
