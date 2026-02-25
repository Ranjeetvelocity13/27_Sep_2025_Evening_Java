package Day_17_25_10_28_Revision;

public class Example8 {

	public static void main(String[] args) {

		//Print all odd number b/w 10 to 50 but skip number divisible by 7
		
		for(int i=10 ; i<= 50 ;i++) {
			
			if(i % 7 == 0) // 10 //false
				continue;
			if(i % 2 != 0)  //10  false
				System.out.print(i+" ");
		}
		
		
	}

}
