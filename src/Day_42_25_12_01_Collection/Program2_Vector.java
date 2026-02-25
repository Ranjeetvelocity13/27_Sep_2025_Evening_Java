package Day_42_25_12_01_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Program2_Vector {

    public static void main(String[] args) {

        // Vector = Dynamic Array + Thread-Safe + Synchronized
        // Default capacity = 10
        // When capacity is full → New capacity = oldCapacity * 2

        Vector vc = new Vector<>();  // Non-generic (can store mixed data)

        // ArrayList default capacity = 10, grows by 50% → newCapacity = old * 1.5
        // Vector grows by 100% → newCapacity = old * 2

        ArrayList Al = new ArrayList(15);  // Custom capacity
        Vector vc1 = new Vector<>(20);     // Vector with custom capacity
        Vector vc2 = new Vector<>(20, 90); // Vector with (capacity, increment)

        // -------------------------------------------------------------
        // Adding Elements
        // -------------------------------------------------------------
        vc.add("Java");
        vc.add("Python");
        vc.add("Selenium");
        vc.add("SQL");
        System.out.println(vc);

        // Insert element at index
        vc.add(1, "HTML");
        System.out.println(vc);

        // Update element
        vc.set(1, "CSS");
        System.out.println(vc);

        // removeElementAt()
        vc.removeElementAt(1);
        System.out.println(vc);

        // -------------------------------------------------------------
        // Reading Elements (Enhanced For Loop)
        // -------------------------------------------------------------
        System.out.println("\n--- Enhanced For Loop ---");
        for (Object obj : vc) {
            System.out.println(obj);
        }

        // -------------------------------------------------------------
        // Iterator
        // -------------------------------------------------------------
        System.out.println("\n--- Iterator ---");
        Iterator<String> it = vc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // -------------------------------------------------------------
        // ListIterator (Forward Direction)
        // -------------------------------------------------------------
        System.out.println("\n--- ListIterator (Forward) ---");
        ListIterator<String> lit = vc.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }
}
