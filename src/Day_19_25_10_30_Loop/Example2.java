package Day_19_25_10_30_Loop;

public class Example2 {

    public static void main(String[] args) {

        /*
         * Example 2: Nested For Loop
         * --------------------------
         * A nested loop means one loop inside another loop.
         * The outer loop controls the number of rows,
         * and the inner loop controls the number of columns.
         *
         * Syntax:
         * for(initialization1; condition1; increment1/decrement1) {   // outer loop
         *     for(initialization2; condition2; increment2/decrement2) {   // inner loop
         *         // code to execute repeatedly
         *     }
         * }
         *
         * Example Output:
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int i = 1; i <= 5; i++) {       // Outer loop -> controls rows
            for (int j = 1; j <= 5; j++) {   // Inner loop -> controls columns
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
