package Day_25_25_11_07_Array;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

	
		int [] arr = {40,30,20,50};   //0 1 2 3 
		
		//1.length
		
		System.out.println(arr[2]);  //40
		System.out.println(arr.length); 
		

        for (int i = 0; i < arr.length; i++) {  // start from index 0
            System.out.print(arr[i]+" ");
        }
        System.out.println();
		
		
		//2.toString - Convert an array into a readable string format
		//System.out.println(arr);
		
		System.out.println("Arrays Element :"+ Arrays.toString(arr));
		
		
		//3. Arrays.sort();
		
		Arrays.sort(arr);
		System.out.println("Sorted array :"+Arrays.toString(arr));
		
		
		//4.Arrays.equals(arr1,arr2)
		
		int [] a1 = {10,20,30};
		int [] a2 = {10,20,30};
		int [] a3 = {10,30,20};
		
		System.out.println(Arrays.equals(a1, a2)); //true
		System.out.println(Arrays.equals(a1, a3));
		
		
		//5.Arrays.copyof
		int [] arrr = {10,20,30,40,50};
		
		int [] newarr = Arrays.copyOf(arrr, 5);
		
		System.out.println(Arrays.toString(newarr));
		
		//6.Arrays.fill() - Fill the entire arrays with a specifed value
		int [] arr1 = new int [5];
		Arrays.fill(arr1, 100);
	
		
		System.out.println(Arrays.toString(arr1));
		
		
		//7. Arrays.binarySearch() 
		//Searches foe an element in a sorted array and retrun its index
		
		
		int [] arr2 = {10,20,30,40,50};
		
		int index =Arrays.binarySearch(arr2, 40);
		System.out.println("Index of 40 :"+index);
				
	}

}
