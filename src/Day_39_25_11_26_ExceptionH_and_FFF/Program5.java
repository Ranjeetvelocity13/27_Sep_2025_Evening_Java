package Day_39_25_11_26_ExceptionH_and_FFF;

import java.util.ArrayList;
import java.util.List;

public class Program5 {

    public static void main(String[] args) {

        // ------------------------------------------
        // 1️⃣ OutOfMemoryError (Heap Memory FULL)
        // ------------------------------------------

        // Example 1: Creating a very large array
        // int arr[] = new int[1000000000]; // Heap space error
        // System.out.println("Array created");

        // Example 2: Infinite object creation inside a loop
        // List<Integer> list = new ArrayList<>();
        // while (true) {
        //    list.add(100);  // JVM heap continues to grow → OutOfMemoryError
        // }

        // ------------------------------------------
        // 2️⃣ StackOverflowError (Call Stack Overflow)
        // ------------------------------------------

        // Program5.test(); // Recursive call → StackOverflowError
    	
        // ------------------------------------------
        // 3️⃣ finally block NOT executed when System.exit() is used
        // ------------------------------------------

        try {
            System.out.println("Try block started");
            System.exit(1);  // JVM stops immediately → finally block will NOT execute
        }
        finally {
            // This line will NOT run because System.exit() stops JVM
            System.out.println("This finally block will NOT execute");
        }
    }
    // Method for infinite recursion → causes StackOverflowError
    public static void test() {
        test(); // Calling itself again and again
    }
}
