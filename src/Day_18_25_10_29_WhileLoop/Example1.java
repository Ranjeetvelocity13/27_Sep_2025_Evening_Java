package Day_18_25_10_29_WhileLoop;

public class Example1 {

    public static void main(String[] args) {

        /*
         *  Example 1: Understanding For Loop Validity
         * ---------------------------------------------
         * General Syntax:
         * for(initialization; condition; increment/decrement) {
         *      // loop body
         * }
         *
         * The for loop executes repeatedly as long as the condition is TRUE.
         * Once the condition becomes FALSE, the loop stops.
         */

        System.out.println(" Valid for loop:");
        // Valid for loop (prints numbers from 0 to 10)
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------------");

        // Infinite Loop Example
        // Because condition is always TRUE, it never stops executing.
        // Uncomment carefully — it will run endlessly!

        /*
        System.out.println(" Infinite loop example (Condition always true):");
        for (int i = 0; true; i++) {
            System.out.println(i);
        }
        */

        System.out.println("-------------------------");

        //  Invalid loop example (condition always false)
        // This loop will never execute even once, because the condition is false.

        /*
        System.out.println(" Condition always false (Loop never executes):");
        for (int i = 0; false; i++) {
            System.out.println(i); // Will never run
        }
        */

        System.out.println("Program completed successfully ");
    }
}
