package Day_24_25_11_06_Array;

public class Example1 {

    public static void main(String[] args) {

        /*
         * Arrays in Java
         * ----------------
         * An array in Java is a collection of elements of the same data type,
         * stored in continuous memory locations.
         *
         * Example: int[] marks = {10, 20, 30, 40, 50};
         *
         * Arrays help store multiple values under one variable name
         * instead of creating separate variables for each value.
         */

        // -----------------------------
        // 1️⃣ First Way: Declaration + Creation + Initialization separately
        // -----------------------------

        int[] marks1 = new int[10]; // Declaration + Creation (size 10)

        // Initialization
        marks1[0] = 10;
        marks1[1] = 20;
        marks1[2] = 30;
        marks1[3] = 40;
        marks1[4] = 50;
        marks1[9] = 100; // last index (index starts from 0)

        System.out.println("marks1[0]: " + marks1[0]); // prints 10
        System.out.println("marks1[9]: " + marks1[9]); // prints 100

        // -----------------------------
        // 2️⃣ Second Way: Declaration + Initialization (shortcut)
        // -----------------------------

        int[] marks = {10, 20, 30, 40, 50};

        /*
         * Explanation:
         * int        → Data type
         * marks      → Array name
         * {10,20,30,40,50} → Array elements
         */

        System.out.println("marks[2]: " + marks[2]); // prints 30

        /*
         * -----------------------------
         * Features of Arrays
         * -----------------------------
         * 1. Fixed Size – Once declared, size cannot be changed.
         * 2. Homogeneous Elements – All elements must be of the same data type.
         * 3. Indexed Access – Index starts from 0.
         * 4. Arrays are Objects – Created dynamically in heap memory.
         */

        /*
         * -----------------------------
         * Syntax and Structure
         * -----------------------------
         *
         * Declaration:
         *      dataType[] arrayName;
         * OR
         *      dataType arrayName[];
         *
         * Creation:
         *      arrayName = new dataType[size];
         *
         * Initialization:
         *      arrayName[index] = value;
         *
         * Example:
         *      int marks[] = new int[5];
         *      marks[0] = 40;
         *      marks[1] = 30;
         *      marks[2] = 60;
         */

        /*
         * -----------------------------
         * Types of Arrays
         * -----------------------------
         * 1. One-Dimensional Array
         *    Example: int[] marks = {10, 20, 30};
         *
         * 2. Two-Dimensional Array
         *    Example: int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
         */
    }
}
