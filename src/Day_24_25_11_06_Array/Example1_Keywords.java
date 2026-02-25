package Day_24_25_11_06_Array;

public class Example1_Keywords {

	int rollNo; // 'int' = keyword; 'rollNo' = identifier
	String name; // 'String' = class name; 'name' = identifier

	public Example1_Keywords(int r, String n) { // 'public' = keyword; 'Example1_Keywords' = constructor name
		rollNo = r;
		name = n;
	}

	public void display() { // 'void' = keyword; 'display' = identifier
		System.out.println("Roll No: " + rollNo + ", Name: " + name);
	}

	public static void main(String[] args) {
		Example1_Keywords s1 = new Example1_Keywords(101, "Rohit");
		s1.display();
	}

}
