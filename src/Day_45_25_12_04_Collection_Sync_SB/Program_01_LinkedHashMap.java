package Day_45_25_12_04_Collection_Sync_SB;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_01_LinkedHashMap {
	
    public static void main(String[] args) throws Exception {
   
    	// LinkedHashMap Features:
    	// ---------------------------------------
    	// 1. Stores data in key-value pairs.
    	// 2. Maintains insertion order (unlike HashMap).
    	// 3. Stores UNIQUE keys & allows MULTIPLE null values.
    	// 4. Internal structure = HashTable + Doubly LinkedList.
    	// 5. Not synchronized → not thread-safe.
    	// 6. Default capacity = 16, Load Factor = 0.75.
    	
    	LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    	
    	map.put("Java", 1);
    	map.put("Python", 2);
    	map.put("Selenium", 3);   // corrected spelling
    	map.put("Java", 10);      // Duplicate key → value is updated

    	System.out.println("LinkedHashMap → " + map);

    	
    	// putIfAbsent() → Adds only if key is NOT present
    	map.putIfAbsent("B", 22);

    	System.out.println(map);  // B → 22 added
    	
    	map.putIfAbsent("Python", 33);  
    	// Python already exists → value not updated

    	System.out.println(map); 
    	
    	
    	// get() → returns value for key
    	System.out.println(map.get("Java")); // 10
    	
    	
    	// remove() → removes key-value pair
    	map.remove("Java");
    	System.out.println(map);
    	
    	
    	// containsKey() → checks if key exists
    	System.out.println(map.containsKey("A")); // false
    	
    	// size() → total key-value entries
    	System.out.println(map.size());
    	
    	// isEmpty() → returns true if map is empty
    	System.out.println(map.isEmpty());
    	
    	
    	// keySet() → returns all keys
    	System.out.println(map.keySet());
    	
    	// values() → returns all values
    	System.out.println(map.values());
    	
    	
    	// entrySet() → iterate both keys and values together
    	for (Map.Entry<String, Integer> e : map.entrySet()) {
    		System.out.println(e.getKey() + " => " + e.getValue());
    	}
    	
    	
    	// replace() → updates value only if key exists
    	map.replace("B", 500);
    	System.out.println(map);
    }
}

// Difference between HashMap & LinkedHashMap
//--------------------------------------------------------------
// Feature              HashMap                  LinkedHashMap
// -------------------------------------------------------------
// Order                No order maintained      Maintains insertion order
// Internal Structure   HashTable                HashTable + Doubly LinkedList
// Null Values/Keys     1 null key allowed       1 null key allowed
// Performance          Faster                   Slightly slower (due to order)
// Use Case             Fast operations          When order matters
