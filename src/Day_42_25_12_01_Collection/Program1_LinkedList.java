package Day_42_25_12_01_Collection;

import java.util.LinkedList;
import java.util.Iterator;

public class Program1_LinkedList {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();  // Generic → stores String only
        LinkedList list1 = new LinkedList<>();         // Raw type → stores mixed data

        // ----------------------------------------
        // 1. add() → Add elements
        // ----------------------------------------
        list.add("Java");
        list.add("Python");
        list.addLast("Selenium");
        list.add("SQL");

        System.out.println("Initial list: " + list);

        // Add element at a specific index
        list.add(1, "C++");
        System.out.println("After add(1, \"C++\"): " + list);

        // Add element at start
        list.addFirst("HTML");
        System.out.println("After addFirst(): " + list);

        // Add element at end
        list.addLast("CSS");
        System.out.println("After addLast(): " + list);

        // ----------------------------------------
        // 2. get() / getFirst() / getLast()
        // ----------------------------------------
        System.out.println("get(0): " + list.get(0));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        // ----------------------------------------
        // 3. set() → Update element
        // ----------------------------------------
        list.set(2, "JavaScript");
        System.out.println("After set(2, \"JavaScript\"): " + list);

        // ----------------------------------------
        // 4. remove()
        // ----------------------------------------
        list.remove(2);         // remove element at index
        System.out.println("After remove(2): " + list);

        list.remove("SQL");     // remove by value
        System.out.println("After remove(\"SQL\"): " + list);

        list.removeFirst();     // remove first element
        System.out.println("After removeFirst(): " + list);

        list.removeLast();      // remove last element
        System.out.println("After removeLast(): " + list);

        // ----------------------------------------
        // 5. offer(), offerFirst(), offerLast()
        // ----------------------------------------
        list.offer("API");
        System.out.println("After offer(\"API\"): " + list);

        list.offerFirst("Cloud");
        System.out.println("After offerFirst(): " + list);

        list.offerLast("DevOps");
        System.out.println("After offerLast(): " + list);

        // ----------------------------------------
        // 6. peek(), peekFirst(), peekLast()
        // ----------------------------------------
        System.out.println("peek(): " + list.peek());              // returns first element
        System.out.println("peekFirst(): " + list.peekFirst());    // same as peek()
        System.out.println("peekLast(): " + list.peekLast());      // returns last element
        System.out.println("peekFirst() on empty list1: " + list1.peekFirst()); // returns null
        System.out.println("peekLast() on empty list1: " + list1.peekLast());   // returns null

        // ----------------------------------------
        // 7. poll(), pollFirst(), pollLast()
        // ----------------------------------------
        System.out.println("poll(): " + list.poll());
        System.out.println(list);

        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println(list);

        System.out.println("pollLast(): " + list.pollLast());
        System.out.println(list);

        // ----------------------------------------
        // 8. push() → Insert at head (Stack usage)
        // ----------------------------------------
        list.push("StackPush");
        System.out.println("After push(): " + list);

        // ----------------------------------------
        // 9. pop() → Removes first element (Stack pop)
        // ----------------------------------------
        System.out.println("pop(): " + list.pop());
        System.out.println(list);

        // ----------------------------------------
        // 10. contains(), size(), isEmpty()
        // ----------------------------------------
        System.out.println("Contains API: " + list.contains("API"));
        System.out.println("Size: " + list.size());
        System.out.println("list is empty: " + list.isEmpty());
        System.out.println("list1 is empty: " + list1.isEmpty());

        // Clear entire list
        list.clear();
        System.out.println("After clear(): " + list);

        // ----------------------------------------
        // Reading data from LinkedList
        // ----------------------------------------

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("Selenium");
        list2.add("SQL");

        // 1. For Loop
        System.out.println("\n--- Read using For Loop ---");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        // 2. Enhanced For Loop
        System.out.println("\n--- Read using Enhanced For Loop ---");
        for (String s : list2) {
            System.out.println(s);
        }

        // 3. Iterator
        System.out.println("\n--- Read using Iterator ---");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
