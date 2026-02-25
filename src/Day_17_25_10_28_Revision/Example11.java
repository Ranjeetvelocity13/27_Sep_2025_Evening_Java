package Day_17_25_10_28_Revision;

public class Example11 {

	public static void main(String[] args) {

		//1 to 5 //1 ,3 ,5 = 9
		//2,4 = 6
		//Addition of odd and even number
		
		int evenSum = 0 ,oddSum = 0;
		
		for(int i =1; i<=5 ;i++) {
			
			if(i%2 == 0)
				evenSum += i;  //evenSum = evenSum+i
			else
				oddSum +=i;
		}
		
		System.out.println("Sum of even number ="+ evenSum);
		System.out.println("Sum of odd number ="+ oddSum);

	}

}
