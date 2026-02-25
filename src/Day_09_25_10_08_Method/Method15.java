package Day_09_25_10_08_Method;

public class Method15 {
//double
	public static void main(String[] args) {
	
		Method15 m15 = new Method15();
		m15.calculateArea(5.5, 3.2);
		m15.calculateArea(6.5, 2.2);

	}
	
	public void calculateArea(double length, double width) {
		
		double area = length * width;
		System.out.println("Area of Rectangle ="+area);
	}

}
