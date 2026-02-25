package Day_22_25_11_04_Constructor;

public class Example1 {


	String model;   
	int year;  
	double price;  
	String color;
	
	public Example1(String Model, int Year, double Price,String Color) {
		
		model = Model;
		year = Year;
		price = Price;
		color = Color;
		
	
	}
	
	public void showCarDetails() {
		
		System.out.println("Car Model :"+ model);
		System.out.println("Manufacturing Year :"+ year);
		System.out.println("Price  :"+ price);
		System.out.println("Color  :"+ color);
		
	}
	
	public static void main(String[] args) {

		
		Example1 car1 = new Example1("TATA Harrier", 2023, 19500000, "White");
		Example1 car2 = new Example1("KIA Seltos", 2024,2000000, "Black");
		Example1 car3 = new Example1("Creta", 2021,2100000, "Red");
		
		car1.showCarDetails();
		System.out.println();
		car2.showCarDetails();
		System.out.println();
		car3.showCarDetails();
		
	}

}
