package Day_21_25_11_03_Constructor;

public class Example0 {

	static String CompanayName = "Capgemini";
	
	String empName;  //rohit
	int empId;  //101
	
	final String dep = "Testing";
	
	public void setData(String name , int id) {
		
		empName = name;
		empId = id;
		
		System.out.println("Employee Data");
		
		System.out.println("Company :"+ CompanayName);
		System.out.println("Employee name :"+ empName);
		System.out.println("Id :"+ empId);
		
		System.out.println("Department :" +dep);
		
	}
	
	public static void main(String[] args) {

     //object
		
		Example0 e3  = new Example0();
		e3.setData("Rohit", 101);
		
		System.out.println("*************");
		
		Example0 e4  = new Example0();
		e4.setData("Vikas", 102);
		
		System.out.println("Access ststic var :"+ Example0.CompanayName);
		
	}

}
