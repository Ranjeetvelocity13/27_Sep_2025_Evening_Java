package Day_30_25_11_13_String;

public class Program4 {

	public static void main(String[] args) {

		
		String sentence  = "automation testing using java and selenium";
		//A T U J A S
		
		String [] words = sentence.split(" ");
		
		String result = "";
		
		for(String w : words) {
			
			result += Character.toUpperCase(w.charAt(0))+ w.substring(1) +" ";
		}
		
		System.out.println(result);
		
	}

}
