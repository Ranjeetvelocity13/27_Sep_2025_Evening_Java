package Day_45_25_12_04_Collection_Sync_SB;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Program_02_HashTable {

    public static void main(String[] args) {
    
        // Hashtable Features:
        // ---------------------------------------
        // 1. Stores data in key-value pairs.
        // 2. All methods are synchronized → Thread Safe.
        // 3. Does NOT allow null key and null value.
        // 4. Slower than HashMap (due to synchronization).
        // 5. Considered a legacy class (introduced in JDK 1.0).
        // 6. Used in multi-threaded applications.
        
        Hashtable<String, Integer> ht = new Hashtable<>();
        
        ht.put("Java", 1);
        ht.put("Selenium", 2);
        // ht.put(null, 3);    // Not allowed → NullPointerException
        // ht.put("API", null); // Not allowed → NullPointerException
        
        System.out.println(ht);
        
        // get() – retrieve value by key
        System.out.println(ht.get("Java"));
        
        // remove() – delete key-value pair
        ht.remove("Java");
        System.out.println(ht);
        
        // size()
        System.out.println(ht.size());
        
        // isEmpty()
        System.out.println(ht.isEmpty());
        
        // containsKey()
        System.out.println(ht.containsKey("Java"));
        
        // putIfAbsent() – adds only if key does not exist
        ht.putIfAbsent("API", 10);
        System.out.println(ht);
        
        // keySet()
        System.out.println(ht.keySet());
        
        // values()
        System.out.println(ht.values());
        
        // Iterating keys
        for (String key : ht.keySet()) {
            System.out.println(key);
        }
        
        // Iterating values
        for (Integer value : ht.values()) {
            System.out.println(value);
        }
        
        // Iterating key-value using entrySet()
        for (Map.Entry<String, Integer> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // Enumeration → legacy iterator for Hashtable
//        Enumeration<String> e = ht.keys();
//        while (e.hasMoreElements()) {
//            String key = e.nextElement();
//            System.out.println(key);
//        }
    }
    
    // Difference between HashMap and Hashtable
    // ---------------------------------------------------------------
    // Feature             HashMap                      Hashtable
    // ---------------------------------------------------------------
    // Thread-safety       Not synchronized             Synchronized (Thread-safe)
    // Null Key            Allowed (only 1)             NOT allowed
    // Null Value          Allowed                      NOT allowed
    // Performance         Faster                       Slower
    // Legacy              Modern class                 Legacy class (JDK 1.0)
    // Use Case            Single-thread apps           Multi-threaded apps
}
