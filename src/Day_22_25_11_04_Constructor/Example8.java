package Day_22_25_11_04_Constructor;

public class Example8 {

	String model;
	int year;

	/* compiler automatically provides:
	 public Example8(){
	 
	 super(),
	 
	 }
	 */
	
	public void showDetials() {

		System.out.println(model);

		System.out.println(year);
	}

	public static void main(String[] args) {

		Example8 e8 = new Example8();
		
		e8.showDetials();
		
	}

}
