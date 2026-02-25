package Day_41_25_11_28_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {

			//Creating array
		
		String arr[] =  {"Java","Python","Ruby","C#"};
		
	//	System.out.println(arr);
		
		for(String str :arr) {
			System.out.println(str);
		}
		
		//convert Array
		ArrayList al = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(al);
		
		
		
		LinkedList li = new LinkedList<>();
		li.add("10");
		li.add("20");
		
		//Linkedlist
		//1.Dynamiz size
		//2.Fast intersion and deltion ()head or tail)
		//S3.Searching slow 
		//4.Allow duplicate values
		//Alllow null values
		//Maintains insertion orders
		//not synchronized - Not thead safe
		//Interanllty use a -double linked list
 	}

}
