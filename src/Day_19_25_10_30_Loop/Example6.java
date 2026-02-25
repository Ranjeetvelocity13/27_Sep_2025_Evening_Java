package Day_19_25_10_30_Loop;

public class Example6 {

    public static void main(String[] args) {

        /*
         * Example 6: Types of Variables in Java
         * --------------------------------------
         * There are 4 types of variables in Java:
         * 1. Local Variables
         * 2. Instance (Non-static) Variables
         * 3. Static Variables
         *
         * This example demonstrates Local Variables.
         */

        // Local Variable
        // Declared inside a method, constructor, or block {}
        int x = 10; // local variable
        System.out.println("Value of x: " + x);

        // Calling another method and passing local variable as argument
        printSquare(x);
    }

    // Method to calculate and print square of a number
    public static void printSquare(int n) {

        // Local variable 'square' declared inside this method
        int square = n * n;
        System.out.println("Square: " + square);
    }
}
