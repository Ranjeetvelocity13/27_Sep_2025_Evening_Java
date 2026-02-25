package Day_17_25_10_28_Revision;

public class Example9 {

	public static void main(String[] args) {

		//Print table of all number from 1 to 3 
	
		
		for (int i = 1 ;i <= 3 ;i++) { 
			//true
			//true 
			//4<=3 - fasle
			System.out.println("Table of " + i);
	
			for(int j = 1 ;j<= 10 ;j++) {
				//true
				//true
				//11<= 10 - false
				System.out.println(i + "x" +j+" = "+(i*j)) ;
			}
			System.out.println();
		}
		System.out.println("Loop completed");
	}

}
