package Day_30_25_11_13_String;

public class Program6 {

	
	public static void main(String[] args) {
		
		
		//Widening (Automatic)
		
		int aa = 100;
		
		double d1 =  aa ;
		System.out.println("Widening :"+d1);
		
		//Narrowing (manual)
		
		double x = 100.99;
		
		int y = (int) x;
		
		System.out.println(y);
		
		
		//char 
		char ch = 'z';
		int asciii = ch;
		System.out.println("Ascii value :"+asciii);
		
		//int to char
		
		int code = 66;
		char leterr = (char) code;
		System.out.println(leterr);
		
	}
}
