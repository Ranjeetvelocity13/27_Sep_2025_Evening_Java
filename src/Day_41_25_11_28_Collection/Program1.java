package Day_41_25_11_28_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Program1 {

	public static void main(String[] args) {
	
		// Collection Framework (CF):
		// It is a set of predefined classes and interfaces to store and manipulate data.
		// A Collection in Java represents a group of objects stored as a single unit.

		// Advantages of Collection Framework:
		// 1. Provides ready-made data structures
		// 2. Easy methods to store, retrieve, sort, search data
		// 3. Better performance
		// 4. Reduced development effort
		// 5. Dynamic size (grows automatically)
		// 6. Thread-safe options available (Vector, Collections.synchronizedList)
		
		// Collection vs Collections:
		// Collection  → Interface
		// Collections → Utility class (contains static methods like sort())

		// List Interface:
		// 1. Ordered collection (insertion order preserved)
		// 2. Index-based access (list.get(0))
		// 3. Allows duplicate elements
		// 4. Allows null values
		// 5. Supports for-loop, iterator(), listIterator()
		// 6. Implementation classes: ArrayList, LinkedList, Vector, Stack
		
		// ArrayList:
		// - Child class of List Interface
		// - Dynamic (Resizable) array
		// - Present in java.util package
		// - Maintains insertion order
		// - Allows duplicate elements
		// - Allows null values
		// - Not synchronized (Not thread-safe)
	
		ArrayList Al = new ArrayList(); 
		
		
		Al.add(20);        // Integer
		Al.add(50);        // Integer
        Al.add("Java");    // String
		Al.add(true);      // Boolean
		Al.add(55.4f);     // Float
		Al.add(null);      // null allowed
		Al.add(30.4);      // Double
		Al.add(50);        // duplicate allowed
		Al.add('A');       // Character
		
		
		//for ,foreach ,
		//iteraor - iterator is a curosr that moves forward throguh a collection and allow reading elements.
		//Iterator support three method
		//hasNext()
		//next()
		//remove();
		
		
		ArrayList<String> list =  new ArrayList<>(); //Defailt list - 10
		
		list.add("Java");
		list.add("Python");
		list.add("Selenium");
		list.add("API");
		
		//Create iterator
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			
			String value = it.next();
			System.out.println(value);
		}
		
		System.out.println("hi");
		

		 
        // Second iteration - removing "Python"
        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()) { 
            String val = it1.next();
            if(val.equals("Python")) {
                it1.remove();
            }
        }
       
		System.out.println(list);
		
// ListIterator - is a bidirectional iterait used to iterate forward and backword in list collection
		
		
		
	ArrayList<String> list1 =  new ArrayList<>(); //Defailt list - 10
		
		list1.add("Java");
		list1.add("Python");
		list1.add("Selenium");
		list1.add("API");
		
		ListIterator<String> li = list1.listIterator();
		
		System.out.println("Forward direction");
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("Backword direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
			
		
		
	}
}
