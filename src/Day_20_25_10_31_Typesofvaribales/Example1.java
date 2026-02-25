package Day_20_25_10_31_Typesofvaribales;

public class Example1 {

////	static String companyName = "Capgemini";  //static global varibale
////	
//	String empName = "Rahul";  //Non static global var
//	int empId = 30;   ////Non static global var
//
//	empName = "Rohit";
//	empid = 100;
	
	final int Max_student = 30;  //contant value
	final double PI = 3.14;
	
	
	public void displayInfo() {
		
		System.out.println("Max student allowed :"+ Max_student);
		System.out.println("Value of PI :"+ PI);
		
	}
	
	public static void main(String[] args) {

		Example1 e1 = new Example1();
		e1.displayInfo();
		
		//e1.Max_student = 50;
		
	}

}
