package Day_37_25_11_24_OOPS;

public class Encapsulation {

	//inher, poly, abstactn AC, encaupltion
	
	//Encapsulation is the process of wrapping data (variables and  methods(functions) together into a single unit(Class)
	
	//Data hinding _ Data Protection + secure Access 
	//Data security
	
	
	//How to achieve encapsulation in java
	//1. Declared variable as private
	//2. Provide public getter and setter method to access then
	
	
	//Step 1 -> Private data - hideen from outside class
	private String name;
	private int age;
	
	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) { //Public settermethod - 
		this.name = name; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}

	}
}
