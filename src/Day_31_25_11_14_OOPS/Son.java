package Day_31_25_11_14_OOPS;

public class Son extends Father{

	public static void main(String[] args) {

		Son S1 = new Son();
		S1.Bike();  
		S1.Car();  
		S1.Home();
		S1.Money();
		
		Father F1 = new Father();
		//F1.Bike();
		F1.Car();
		F1.Home();
		F1.Money();
		

		
	}
	
	public void Bike() {
		
		System.out.println("Bike -- FZ");
	}

}
