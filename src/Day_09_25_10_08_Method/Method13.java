package Day_09_25_10_08_Method;

public class Method13 {

	//Parameterized Method is a method that takes input values when it is called

	//public void methodName(dataType parameter1, dataType parameter2){
	
//}
	public void showDetails(String name, int age) {
		
		System.out.println("Studnet Name - "+ name); //Rohit
		System.out.println("Student age  - "+ age);   //35
		
	}
	
	public static void main(String[] args) {
	
		Method13 m13 = new Method13();  //Create object
		
		//Passing arguments/input parameters while calling the method
		
		m13.showDetails("Rohit", 35);
		m13.showDetails("Virat", 40);  
		m13.showDetails("Rahul", 34);

	}
	
	
}
