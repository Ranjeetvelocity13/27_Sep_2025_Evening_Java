package Day_18_25_10_29_WhileLoop;

public class Example2 {

    public static void main(String[] args) {

        /*
         * Example 2: Variations in For Loop
         * ------------------------------------
         * The for loop allows:
         * Multiple variable declarations (in initialization section)
         *  Multiple conditions joined by logical operators (&&, ||)
         *  Only ONE final boolean result in the condition part
         *  Invalid data types in increment section (e.g., String++)
         */

        //  Example 1: Multiple variables in initialization (Valid)
        for (int i = 0, j = 1, k = 2; i <= 5; i++) {
            System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        }

        System.out.println("----------------------------------------");

        //  Example 2: Multiple logical conditions in the condition part
        for (int i = 0, j = 1, k = 2; i <= 5 || j <= 5; i++) {
            System.out.println("i = " + i + ", j = " + j + ", k = " + k);
            j++; // increment j manually inside loop
        }

        System.out.println("----------------------------------------");

        //  Example 3: Using comma (,) in condition part → Invalid
        // In the condition part, the expression must return a SINGLE boolean result.
        /*
        for (int i = 0, j = 1; i <= 5, j <= 5; i++) { // Invalid syntax
            System.out.println(i);
        }
        */

        //  Rule: Condition section must return a boolean value (true/false)

        System.out.println("----------------------------------------");

        //  Example 4: Invalid data type in increment section
        // You cannot increment/decrement non-numeric types like String.
        /*
        for (String str = "Java"; str <= "10"; str++) { // Invalid
            System.out.println(str);
        }
        */

        //  Only numeric (int, byte, short, long, double, char) are valid in increment/decrement

        System.out.println("----------------------------------------");

     // Example 5: Infinite loop using for(;;)
        // All three sections (init, condition, increment) are optional.
        // This is valid syntax but creates an infinite loop.
        /*
        for (;;) { 
            System.out.println("Infinite loop running...");
        }
        */
        System.out.println("Program completed successfully");
    }
    }
