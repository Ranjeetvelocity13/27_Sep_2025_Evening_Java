package Day_44_25_12_03_Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program_01_Queue {

    public static void main(String[] args) {

        // =====================================================
        // 1. Queue (Interface) → Implemented by LinkedList
        // FIFO → First In First Out
        // =====================================================
        Queue<String> q = new LinkedList<>();

        q.add("X");
        q.add("B");
        q.add("C");

        System.out.println("LinkedList Queue: " + q);

        // =====================================================
        // 2. PriorityQueue → Elements sorted according to natural ordering
        // Default capacity = 11
        // Does NOT allow null
        // =====================================================
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(60);
        pq.add(10);
        pq.add(5);

        System.out.println("PriorityQueue: " + pq); // Automatically sorted (Min-Heap)

        // =====================================================
        // 3. ArrayDeque → Faster than LinkedList, No null allowed
        // Can be used as Queue & Stack (Deque)
        // =====================================================
        ArrayDeque<String> aq = new ArrayDeque<>();
        ArrayDeque<String> aq1 = new ArrayDeque<>();

        aq.add("A");
        aq.add("B");
        aq.add("C");

        System.out.println("ArrayDeque initial: " + aq);

        aq.offer("AA");
        aq.offer("BB");
        aq.offer("CC");

        System.out.println("After offer(): " + aq);

        System.out.println("Poll from aq: " + aq.poll());  // removes head
        System.out.println("aq after poll: " + aq);

        System.out.println("Poll from empty aq1: " + aq1.poll());  // returns null
        System.out.println("aq1: " + aq1);


        // =====================================================
        // PriorityQueue with Strings
        // =====================================================

        PriorityQueue<String> PO = new PriorityQueue<>();
        PriorityQueue<String> PO1 = new PriorityQueue<>();

        PO.add("A");
        PO.add("B");
        PO.add("C");
        PO.add("D");
        System.out.println("Add duplicate D: " + PO.add("D")); // true (duplicates allowed)

        System.out.println("PriorityQueue PO: " + PO);

        // offer()
        PO.offer("F");
        System.out.println("After offer F: " + PO);

        // element() → returns head, throws exception if empty
        System.out.println("PO.element(): " + PO.element());
        // System.out.println(PO1.element()); // NoSuchElementException

        // peek() → returns head, returns null if empty
        System.out.println("PO.peek(): " + PO.peek());
        System.out.println("PO1.peek(): " + PO1.peek()); // null

        // remove() → removes head, throws exception if empty
        System.out.println("PO.remove(): " + PO.remove());

        // poll() → removes head, returns null if empty
        System.out.println("PO.poll(): " + PO.poll());
        System.out.println("PO1.poll(): " + PO1.poll()); // null

        // Iterating PQ
        for (Object obj : PO) {
            System.out.println(obj);
        }


        // =====================================================
        // ArrayDeque (Deque Methods)
        // =====================================================
        ArrayDeque<String> ADQ = new ArrayDeque<>();
        ADQ.add("A");
        ADQ.add("B");
        ADQ.add("C");
        ADQ.add("D");

        // getFirst(), getLast()
        System.out.println("ADQ.getFirst(): " + ADQ.getFirst());
        System.out.println("ADQ.getLast(): " + ADQ.getLast());

        // removeFirst(), removeLast()
        System.out.println("ADQ.removeFirst(): " + ADQ.removeFirst());
        System.out.println("ADQ.removeLast(): " + ADQ.removeLast());

        System.out.println("ADQ current: " + ADQ);

        // pollFirst(), pollLast()
        System.out.println("ADQ.pollFirst(): " + ADQ.pollFirst());
        System.out.println("ADQ.pollLast(): " + ADQ.pollLast());
      
    }
}
