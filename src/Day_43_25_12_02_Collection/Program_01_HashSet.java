package Day_43_25_12_02_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Program_01_HashSet {

    public static void main(String[] args) {

        // HashSet = No duplicate, No indexing, Unordered, Fast search, Allows only one null
        // Default capacity = 16
        // Default load factor = 0.75
        HashSet<String> set = new HashSet<>();

        set.add("F");
        set.add("A");
        set.add("B");
        set.add("DD");
        set.add("C");

        // Adding new value
        System.out.println(set.add("SS"));   // true (added)
        System.out.println(set);             // Order is NOT preserved

        /*
            HashSet Properties:
            - Implemented using HashTable
            - No duplicates allowed
            - No indexing (cannot access by index)
            - Allows only one null value
            - Very fast for search operations due to hashing
            - Order is not preserved (unordered collection)
        */


        // ==============================
        // Creating a HashSet of Strings
        // ==============================
        HashSet<String> set1 = new HashSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("Java");   // Duplicate (ignored)

        System.out.println(set1.size());  // 2
        System.out.println(set1);

        // remove()
        set1.remove("Python");
        System.out.println(set1);

        // contains()
        System.out.println(set1.contains("Java")); // true

        // size()
        System.out.println(set1.size());

        // isEmpty()
        System.out.println(set1.isEmpty());

        // clear()
        set1.clear();
        System.out.println(set1);
        System.out.println(set1.size());


        // ==============================
        // Heterogeneous HashSet
        // ==============================
        HashSet HS = new HashSet<>();

        HS.add("Java");
        HS.add(123);
        HS.add(true);
        HS.add('F');
        HS.add(null);
        HS.add(null);    // ignored
        HS.add("Java");  // duplicate ignored

        System.out.println(HS);
        System.out.println(HS.size());

        // Enhanced for loop
        for (Object obj : HS) {
            System.out.println(obj);
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator obj1 = HS.iterator();
        while (obj1.hasNext()) {
            System.out.println(obj1.next());
        }


        // ==============================
        // HashSet with custom capacity/load factor
        // ==============================
        // HashSet<String> cities = new HashSet<>(20, 0.90f);
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("London");
        cities.add("Tokyo");

        System.out.println("\nCities: " + cities);


        // ==============================
        // Convert HashSet to Array
        // ==============================
        String[] charArray = cities.toArray(new String[0]);

        System.out.println("\nConverted Array:");
        for (String str : charArray) {
            System.out.println(str);
        }
    }
}
