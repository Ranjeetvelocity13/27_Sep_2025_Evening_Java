package Day_25_25_11_07_Array;

public class Exmaple3 {

	public static void main(String[] args) {

		//find sum and  avg of array
		int [] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int i : arr) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		int avg = sum / arr.length;
	
		System.out.println(avg);
		
		Exmaple3.MaxMin();
		Exmaple3.ReverseArray();
	}
	
	
	public static void MaxMin() {
		
		int arr [] = {20,50,10,90,70}; 
		
		int max = arr[0], 
			min = arr[0];
		
		
		for(int n : arr) {
			if(n > max)     //50 > 10 - true 
				max = n;
			if(n < min)   //20 < 20 - false
				min = n;
		}
		
		System.out.println("Maximun :"+ max);
		System.out.println("Minium : "+ min);
	}
	
	
	public static void ReverseArray() {
		
		int arr [] = {20,50,10,90,70}; 
		
		System.out.println("Original :");
		for(int n :arr)
			System.out.print(n+" ");
		
		System.out.println("\nreversed arrays");
		
		for(int i = arr.length -1 ;i >= 0 ;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
