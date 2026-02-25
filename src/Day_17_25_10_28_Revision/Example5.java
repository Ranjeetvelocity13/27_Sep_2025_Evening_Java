package Day_17_25_10_28_Revision;

public class Example5 {

	public static void main(String[] args) {

		//Display season by monthe number
		
		//Switch statment
		
		int month = 11;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter season");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Summer season");
			break;
		
		case 7:
		case 8:
		case 9:
			System.out.println("Rainy season");
			
		default:
			System.out.println("Autumn season");
		
		}
	}
	
	

}
