package Day_09_25_10_08_Method;

public class Method18 {

	public void Studentinfomation(String instituteName, String courseName, String firstName, String lastName,
			String mailId, int passoutYear, int rollNo, char studentGrade, double studentPercentage) {
		

		System.out.println("instituteName => " + instituteName);
		System.out.println("courseName => " + courseName);
		System.out.println("firstName =>" + firstName);
		System.out.println("lastName =>" + lastName);
		System.out.println("mailId =>" + mailId);
		System.out.println("PassoutYear =>" + passoutYear);
		System.out.println("rollNo =>" + rollNo);
		System.out.println("studentGrade =>" + studentGrade);
		System.out.println("studentPercentage =>" + studentPercentage);
		System.out.println("---------------------");
		
	}

	public static void main(String[] args) {
	
	
		Method18 student1 = new Method18();
		
		Method18 student2 = new Method18();

		student1.Studentinfomation("Velocity Corporate Training Center", "Software Testing", "Rahul", "Patil","rahul@gmail.com", 2015, 105, 'A', 70.5);
		student1.Studentinfomation("Velocity Corporate Training Center", "Java development", "Ketan", "Jadhav","Ketanl@gmail.com", 2020, 107, 'B', 60.5);
 
		
		

		
	}

}
