package Day_30_25_11_13_String;

public class Program2 {

	public static void main(String[] args) {


		//1.  Count he totla number o fchar in String
		
		String name = "Automation";  
		
		int count = 0;
		
		for(int i = 0 ;i < name.length() ;i++) {
			count++;
		}
		
		System.out.println(count);
		
		
		Program2.VowelConsonantCount();
	}
	
	public static void VowelConsonantCount(){
		
		
		String str = "Java Programming".toLowerCase();
		
		int vowels = 0, consonants = 0;
		
		for(int i =0 ; i< str.length() ;i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				
				if("aeiou".indexOf(ch) != -1) //true  //-1 != -1 //false
					vowels++;
				else
					consonants++;
				
			}
		}
		System.out.println("Vowels :"+ vowels);
		System.out.println("Consonants :"+ consonants);
		
	}
	
}
