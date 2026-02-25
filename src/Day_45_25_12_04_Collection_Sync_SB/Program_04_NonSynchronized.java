package Day_45_25_12_04_Collection_Sync_SB;

class Counter {
    int count = 0;  // non-static global variable (shared resource)

    public void increment() {
        count++;  // Not synchronized → race condition possible
    }
}

public class Program_04_NonSynchronized {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        // Thread t1 increments count 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        // Thread t2 increments count 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        // join() → makes main thread wait until both t1 & t2 complete
        t1.join();
        t2.join();

        System.out.println("Expected count = 2000");
        System.out.println("Actual count   = " + c.count);  
        
        // In non-synchronized code, output may NOT be 2000.
        // It may be less (like 1880, 1923, 1995, etc.)
        // because multiple threads modify 'count' at the same time (race condition).


        // ---------------------------------------------
        // Thread Basics
        // ---------------------------------------------
        // A thread is a lightweight unit of execution.
        // A Java program can run multiple threads at the same time.

        // Example real-time threads:
        // - Thread 1: Saving a file
        // - Thread 2: Writing logs
        // - Thread 3: Sending email


        // ---------------------------------------------
        // Why Synchronization?
        // ---------------------------------------------
        // When two or more threads access the SAME resource (like 'count'),
        // data inconsistency occurs → race condition.
        //
        // Synchronization ensures only ONE thread can access the resource at a time.


        // Real-world examples:
        // - ATM Machine → Only one user can withdraw at a time.
        // - Telephone booth → One person talks, others wait.
        // - Buffet counter → People take food one by one.
        

        // ---------------------------------------------
        // Synchronized classes in Java
        // ---------------------------------------------
        // These are thread-safe:
        // - Vector
        // - Hashtable
        // - StringBuffer
        // - Stack


        // Non-synchronized classes (NOT thread-safe):
        // - ArrayList
        // - LinkedList
        // - HashMap
        // - HashSet
        // - StringBuilder
        // - TreeMap
        // - LinkedHashMap
    }
}
