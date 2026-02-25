package Day_09_25_10_08_Method;

public class Method17 {

	public static void main(String[] args) {

		Method17.showData("Ravi", 'A', false);
		Method17.showData("Sneha", 'B', true);
		
		
	}

	public static void showData(String name, char grade, boolean isPassed) {
		
		
		System.out.println("Name :"+ name);
		System.out.println("Grade :"+ grade);
		System.out.println("Passed :"+ isPassed);
		System.out.println("--------------------------");
		
	}
}
