package Day_09_25_10_08_Method;

public class Method16 {
//Employee info
	public static void main(String[] args) {

		Method16.showEmployeeDetails(57574, "Mahesh", 50000.50);
		Method16.showEmployeeDetails(57575, "Rajesh", 60000);
	}

	public static void showEmployeeDetails(int id, String name, double salary) {
		
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name :"+ name);
		System.out.println("Employee Salary :"+salary);
		System.out.println("-------------------------");
		
	}
}
