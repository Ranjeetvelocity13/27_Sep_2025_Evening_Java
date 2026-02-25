package Day_40_25_11_27_Collection;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
	
		// Raw ArrayList (No Generics)
		// Allows Heterogeneous data types
		ArrayList Al = new ArrayList<>();
		
		Al.add(20);        // Integer
		Al.add(50);        // Integer
        Al.add("Java");    // String
		Al.add(true);      // Boolean
		Al.add(55.4f);     // Float
		Al.add(null);      // null allowed
		Al.add(30.4);      // Double
		Al.add(50);        // duplicate allowed
		Al.add('A');       // Character	
		
		System.out.println(Al);   // Prints the whole list in one line
		
		// Iteration using normal for loop (index based)
		System.out.println("\n--- Using Classic For Loop ---");
		for(int i = 0; i < Al.size(); i++) {
			System.out.println(Al.get(i));
		}
		
		// Iteration using Enhanced For Loop
		System.out.println("\n--- Using Enhanced For Loop ---");
		for(Object obj : Al) {
			System.out.println(obj);
		}
	}
}
