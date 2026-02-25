package Day_16_25_10_17_LoopingStatement;

public class Example6 {

    public static void main(String[] args) {

        /*
         * 📘 Example 6: Calculate Factorial of a Number
         * ----------------------------------------------
         * Factorial Definition:
         * The factorial of a number n (written as n!) is the product of all 
         * positive integers less than or equal to n.
         *
         * Formula:
         * n! = n × (n - 1) × (n - 2) × ... × 3 × 2 × 1
         *
         * Example:
         * 5! = 5 × 4 × 3 × 2 × 1 = 120
         */

        int num = 10;   // number whose factorial we need
        int fact = 1;   // variable to store the result

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            fact = fact * i;  // Multiply and store each step
        }
        // Display result
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
