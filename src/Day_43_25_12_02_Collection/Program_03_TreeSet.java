package Day_43_25_12_02_Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Program_03_TreeSet {

    public static void main(String[] args) {

        // TreeSet → Sorted Set implementation (Unique + Sorted)
        // ✔ Stores only unique values
        // ✔ Automatically sorts elements in ascending order (default)
        // ✔ Slower than HashSet & LinkedHashSet (uses Red-Black Tree)
        // ✔ Does NOT allow null values (NullPointerException)
        // ✔ Maintains natural ordering → numbers ascending, characters alphabetical

        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<String> ts1 = new TreeSet<>(Comparator.reverseOrder());  // Sorting in reverse order

        ts.add(20);
        ts.add(10);
        ts.add(30);
        ts.add(40);

        System.out.println("Integer TreeSet: " + ts); // [10,20,30,40]

        // Character TreeSet
        TreeSet<Character> ts2 = new TreeSet<>();

        ts2.add('D');
        ts2.add('X');
        ts2.add('C');
        ts2.add('D');  // Duplicate → ignored

        System.out.println("Character TreeSet: " + ts2); // [C, D, X]

        // Size
        System.out.println("Size of ts2: " + ts2.size());

        // first() & last()
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // Range methods
        System.out.println("ts.higher(10): " + ts.higher(10));  // 20 (next higher)
        System.out.println("ts.higher(20): " + ts.higher(20));  // 30
        System.out.println("ts.higher(30): " + ts.higher(30));  // 40

        System.out.println("ts.lower(30): " + ts.lower(30));    // 20
        System.out.println("ts.lower(10): " + ts.lower(10));    // null (no lower value)
    }
}
