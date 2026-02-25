package Day_24_25_11_06_Array;

import java.util.Arrays;

public class Example3 {

    public static void main(String[] args) {

        /*
         * Arrays Utility Class
         * --------------------
         * Java provides a built-in class `java.util.Arrays`
         * that contains many static methods to manipulate arrays easily.
         *
         * Commonly used methods:
         *  - Arrays.toString() → Convert array to string
         *  - Arrays.sort() → Sort array in ascending order
         *  - Arrays.equals() → Compare two arrays
         *  - Arrays.copyOf() → Copy array to another
         *  - Arrays.fill() → Fill array with a specific value
         */

        // Declare and initialize an array
        int[] marks = {65, 90, 40, 55, 83};

        System.out.println("Original Array (before sorting): " + Arrays.toString(marks));

        // Sort the array in ascending order
        Arrays.sort(marks);

        System.out.println("Sorted Array (ascending): " + Arrays.toString(marks));

        // Display smallest and largest element
        System.out.println("Smallest Element: " + marks[0]);
        System.out.println("Largest Element: " + marks[marks.length - 1]);

        /*
         * Explanation:
         * Arrays.sort() uses a Dual-Pivot Quicksort algorithm internally for primitive types.
         * It sorts the array elements in ascending order.
         *
         * Example:
         * Original: [65, 90, 40, 55, 83]
         * Sorted:   [40, 55, 65, 83, 90]
         */
    }
}
