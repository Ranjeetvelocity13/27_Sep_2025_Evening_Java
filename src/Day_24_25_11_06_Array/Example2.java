package Day_24_25_11_06_Array;

public class Example2 {

    public static void main(String[] args) {

        /*
         * Arrays of Different Data Types
         * -------------------------------
         * Arrays can store values of only one data type,
         * but we can create arrays of different data types.
         */

        int[] arr = new int[5];         // Integer array
        String[] arr1 = new String[3];  // String array
        char[] arr2 = new char[3];      // Character array
        long[] arr3 = new long[2];      // Long array
        boolean[] arr4 = new boolean[3]; // Boolean array

        // Direct initialization (static way)
        int[] arr5 = {10, 20, 30};
        String[] arr6 = {"A", "B", "C"};

        // --------------------------------------------
        // Example: Accessing array elements by index
        // --------------------------------------------
        int[] number = {10, 20, 30, 40, 50};

        System.out.println("Accessing Elements Individually:");
        System.out.println("number[0] = " + number[0]);
        System.out.println("number[1] = " + number[1]);
        System.out.println("number[2] = " + number[2]);
        System.out.println("number[3] = " + number[3]);
        System.out.println("number[4] = " + number[4]);

        // Uncommenting this will cause an error:
        // System.out.println(number[5]);  // ArrayIndexOutOfBoundsException

        System.out.println("--------------------------------");

        // --------------------------------------------
        // Display array size using .length
        // --------------------------------------------
        System.out.println("Array Size (number.length): " + number.length);
        System.out.println("--------------------------------");

        // --------------------------------------------
        // Access elements dynamically using for loop
        // --------------------------------------------
        System.out.println("Printing array elements using for loop:");

        for (int i = 0; i < number.length; i++) {  // start from index 0
            System.out.println("Element at index " + i + ": " + number[i]);
        }

        System.out.println("--------------------------------");

        // --------------------------------------------
        // Access elements using enhanced for loop (for-each)
        // --------------------------------------------
        System.out.println("Printing array elements using for-each loop:");
        for (int num : number) {
            System.out.println(num);
        }

        /*
         * Key Notes:
         * 1. Array index starts from 0 and ends at (length - 1).
         * 2. Accessing index beyond the array length throws ArrayIndexOutOfBoundsException.
         * 3. 'length' is a property (not a method) that gives array size.
         * 4. For-each loop is used when you just need to read elements.
         */
    }
}
