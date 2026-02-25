package Day_45_25_12_04_Collection_Sync_SB;

class Counter1 {
    int count = 0;  // shared resource

    // synchronized method → solves race condition
    public synchronized void increment() {
        count++;  // Only ONE thread can run this at a time
    }
}

public class Program_05_Synchronized {

    public static void main(String[] args) throws InterruptedException {

        Counter1 c = new Counter1();  // Correct class used

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

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Expected count = 2000");
        System.out.println("Actual count   = " + c.count);  
        // With synchronized → Always 2000
    }
}
