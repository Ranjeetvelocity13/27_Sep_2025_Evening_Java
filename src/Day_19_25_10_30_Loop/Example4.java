package Day_19_25_10_30_Loop;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 2 3
		 * 2 4 6
		 * 3 6 9
		 */
		
		for (int i=1 ;i<=3 ;i++) {
			
			for(int j=1 ; j<=3 ;j++) {
				
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
