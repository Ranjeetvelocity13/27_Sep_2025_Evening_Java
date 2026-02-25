package Day_15_25_10_16_LoopingStatement;

public class Example4 {

    public static void main(String[] args) {

        /*
         * 📘 Example: Multiplication Table using for loop
         * -----------------------------------------------
         * Program to print the multiplication table of a given number.
         *
         * Example (for num = 5):
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         */

        System.out.println("For loop started");

        int num = 5; // number whose table we want to print

        // for loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Each iteration prints one line of the table
            // Example:   5 x 1 = 5
            //            5 x 2 = 10
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("For loop ended");
    }
}
