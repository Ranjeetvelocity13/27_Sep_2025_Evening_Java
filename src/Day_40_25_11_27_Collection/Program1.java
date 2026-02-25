package Day_40_25_11_27_Collection;

import java.util.ArrayList;

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
		
	
		ArrayList<String> Test = new ArrayList<>();
		
		
		// 1. add(E element) → Adds element at end
		Test.add("Apple");   
		// Test.add(10); // ❌ ERROR: ArrayList<String> only accepts Strings
		Test.add("Mango");
		Test.add("Mango1");
		
		System.out.println(Test);
		
		
		// 2. add(int index, E element) → Adds element at specific index
		Test.add(1, "Banana");
		System.out.println(Test);
		
		
		// 3. get(int index) → Returns element at given index
		String fruit = Test.get(1);
		System.out.println(fruit);
		
		
		// 4. set(int index, E element) → Replace element at given index
		Test.set(1, "Orange");
		System.out.println(Test);
		
		
		// 5. remove(int index) → Removes element at given index
		Test.remove(0);
		System.out.println(Test);
		
		
		// 6. remove(Object o) → Removes first occurrence of the element
		System.out.println("Size before remove: " + Test.size());
		Test.remove("Mango1");
		System.out.println(Test);
		
		
		// 7. size() → Returns total number of elements
		System.out.println("Size: " + Test.size());
		
		
		// 8. contains(Object o) → Checks if the element exists
		System.out.println(Test.contains("Orange"));  // true
		System.out.println(Test.contains("Orange1")); // false
		
		
		// 9. isEmpty() → Returns true if list is empty
		System.out.println("Is Empty? " + Test.isEmpty());
		
		
		// 10. clear() → Removes all elements
		Test.clear();
		System.out.println(Test);
		System.out.println("Is Empty After Clear? " + Test.isEmpty());
		
		
		// 11. indexOf(Object o) → Returns first index of element
		Test.add("A");
		Test.add("B");
		Test.add("A");
		Test.add("C");
		
		System.out.println("First Index of A: " + Test.indexOf("A")); // 0
		
		
		// 12. lastIndexOf(Object o) → Returns last index of element
		System.out.println("Last Index of C: " + Test.lastIndexOf("C"));
		
		
		// 13. addAll(Collection c) → Adds another list
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
	    
		Test.addAll(list1);
		System.out.println(Test);
		System.out.println("Size After addAll: " + Test.size());
		
		
		// Difference between Array & ArrayList
		// Array → Fixed size, same data type
		int arr[] = new int[10];
		arr[0] = 40;
		arr[1] = 50;
		
		// ArrayList → Dynamic + Heterogeneous (if raw type used)
		ArrayList Al = new ArrayList<>();  // Raw type → allows heterogeneous data
		Al.add("Test");
		Al.add(10);
		
		// Generic ArrayList → Homogeneous
		ArrayList<Integer> Al1 = new ArrayList<Integer>(); 
		// Al1.add("Test"); // ❌ ERROR: Only Integers allowed
		
		for(Integer value : Al1) {
			// iteration — but list is empty now
		}
	}
}
