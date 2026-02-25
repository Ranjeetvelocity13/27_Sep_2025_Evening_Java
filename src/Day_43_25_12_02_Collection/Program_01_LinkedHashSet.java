package Day_43_25_12_02_Collection;

import java.util.LinkedHashSet;

public class Program_01_LinkedHashSet {

    public static void main(String[] args) {

        // LinkedHashSet
        // -------------------------------
        // ✔ Does NOT allow duplicates
        // ✔ Maintains insertion order (unlike HashSet)
        // ✔ Uses LinkedList + HashTable internally
        // ✔ Allows only one null value
        // ✔ Slightly slower than HashSet because it maintains order
        // ✔ Default capacity = 16, Load factor = 0.75

        LinkedHashSet<String> LH = new LinkedHashSet<>();

        LH.add("A");
        LH.add("B");
        LH.add("C");
        LH.add("D");

        System.out.println("Initial LinkedHashSet: " + LH);

        // Remove element
        LH.remove("A");
        System.out.println("After removing A: " + LH);

        // contains()
        System.out.println("Contains 'A'?: " + LH.contains("A"));

        // size()
        System.out.println("Size: " + LH.size());

        // -----------------------------------
        // Difference Between HashSet & LinkedHashSet
        // -----------------------------------
        // HashSet           → No order, Faster
        // LinkedHashSet     → Ordered, Slightly slower

        // -----------------------------------
        // addAll() Example
        // -----------------------------------
        LinkedHashSet<String> lh1 = new LinkedHashSet<>();

        lh1.add("API");
        lh1.add("Python");

        LH.addAll(lh1);
        System.out.println("After addAll(): " + LH);

        // clear()
        LH.clear();
        System.out.println("After clear(), size: " + LH.size());
    }
}
