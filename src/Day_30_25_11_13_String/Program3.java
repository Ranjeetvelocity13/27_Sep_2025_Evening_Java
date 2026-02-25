package Day_30_25_11_13_String;

public class Program3 {

	public static void main(String[] args) {

		
		//Reverse a string 
		
		String str = "Java";
		
		String rev = "";
		
		for(int i= str.length() -1 ;i >= 0 ;i-- ) {
			
			rev = rev +str.charAt(i);
		}
		
		System.out.println("Reverse String :"+rev);
		
		
		Program3.palindrome();
	}

	
     // check if a string is palindrome 
	
	public static void palindrome() {
		
		String str = "Java";
		
		
		String rev = "";
		
		for(int i = str.length() -1 ; i >=0 ;i--) {
			
			rev = rev +str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(str +" is a  palindrome");
		}
		else {
			System.out.println(str +" is not a palindrome");
		}
		
	}
	
	
}
