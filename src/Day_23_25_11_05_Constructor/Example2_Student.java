package Day_23_25_11_05_Constructor;

public class Example2_Student {

	String name;
	int rollNo;
	double marks;
	
	//paramerterized constructor 
	
	public Example2_Student(String name, int rollNo, double marks) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Student Name :"+ name);
		System.out.println("Roll Number :"+ rollNo);
		System.out.println("Marks : "+marks);
		System.out.println("-------------------------");

		
	}
	
	public static void main(String[] args) {

		Example2_Student s1 = new Example2_Student("Rohit",101, 89.5);
		Example2_Student s2 = new Example2_Student("Vikas",102, 99.5);
		Example2_Student s3 = new Example2_Student("Ketan",103, 79.5);
		
		
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}

}
