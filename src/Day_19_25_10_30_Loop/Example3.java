package Day_19_25_10_30_Loop;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print a right angled Trangled pattern
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		
		for (int i =1 ; i<=5 ;i++) {
			//true
			//true
			for( int j =1 ; j<=i ;j++) {
				//true
				//false
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
