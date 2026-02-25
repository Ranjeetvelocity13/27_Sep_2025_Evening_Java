package Day_10_25_10_09_Method;

public class Method25 {

	public void showBasicInfo(String name, int rollNo) {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
	}

	public void showFullInfo(String name, int rollNo, String course) {
		// Call another method to reuse logic
		showBasicInfo(name, rollNo);
		System.out.println("Course: " + course);
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		Method25 m25 = new Method25();
		m25.showFullInfo("Viraj", 101, "Java");
		m25.showFullInfo("Managesh", 102, "Python");
	}
}
