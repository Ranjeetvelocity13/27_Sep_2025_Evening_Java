package Day_09_25_10_08_Method;

public class Method14 {

	public void addNumber() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Additon =" + sum);
	}

	public void additon(int a, int b) {

		int sum = a + b;
		System.out.println("Addition - " + sum);
	}

	public static void main(String[] args) {

		Method14 m14 = new Method14();

		m14.addNumber();
		m14.additon(20, 40);
		m14.additon(40, 60);

	}
}
