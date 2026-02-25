package Day_26_25_11_10_Array;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args) {
        
        // 1. String Array - Store browser names
        String[] browsers = {"Chrome", "Edge", "Firefox"};
        
        System.out.println("Available Browsers:");
        for (String browser : browsers) {
            System.out.println(browser);
        }

        System.out.println("------------------------------");
        
        // 2. Compare two String arrays (Expected vs Actual)
        // Used commonly in automation testing for validation

        String[] expected = {"Order Placed", "Shipped", "Delivered"};
        String[] actual   = {"Order Placed", "Shipped", "Delivered1"};

        // Arrays.equals() compares content of both arrays
        if (Arrays.equals(expected, actual)) {
            System.out.println("Test Passed  : Order statuses match");
        } else {
            System.out.println("Test Failed  : Mismatch found");
        }

        System.out.println("------------------------------");

        // 3. Object Array - To store different data types
        // Object[] allows heterogeneous (non-similar) data
        Object[] obj = new Object[7];

        obj[0] = 10;          // Integer
        obj[1] = 'A';         // Character
        obj[2] = true;        // Boolean
        obj[3] = "Java";      // String
        obj[4] = 15.5f;       // Float
        obj[5] = 49.44d;      // Double
        obj[6] = null;        // Null value (optional)

        System.out.println("Object Array Elements:");
        for (Object element : obj) {
            System.out.println(element);
        }
    }
}
