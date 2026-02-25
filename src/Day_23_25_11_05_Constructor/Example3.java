package Day_23_25_11_05_Constructor;

public class Example3 {

	//Constructor chaining
	//cc means calling one constructor from another constructor within same class
	//or from parent class
	//it helps resue initialization code and avoid duplication
	
	//types of con chaining
	//1. witin the same class
	//2. from parent class
	
	//this and super are the first statement inside a constructor
	//u can not use this() and super() in the same const.
	
	
	String name;
	int id;
	double salary;
	
	public Example3() {

		this("Rohit",101,1000.0); 
		System.out.println("Default constructor called");
		
	}
	
	public Example3(String name , int id) {
		
		System.out.println("Two parameter consterucotr called");
	
	}
	
	public Example3(String name, int id ,double salary) {
		
		this("Test",10);	
		this.name = name;
		this.id = id;
		this.salary = salary;
		
		System.out.println("Three parameter constructor called");
		
		
	}
	
	public void show() {
		
		System.out.println("Name :"+ name +" id :"+id +" Salary :"+salary);
	}
	
	public static void main(String[] args) {

		Example3 e1 = new Example3();
		e1.show();
		
	
	}

}
