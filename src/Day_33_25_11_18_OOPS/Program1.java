package Day_33_25_11_18_OOPS;

public class Program1 {

	protected static int num = 10;

	protected void name() {

		System.out.println("Protected Method");
	}


	public static void main(String[] args) {

		Program1 P1 = new Program1();

		P1.name();

		System.out.println(num);

	}
}
