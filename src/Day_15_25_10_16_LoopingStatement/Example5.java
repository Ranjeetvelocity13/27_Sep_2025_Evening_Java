package Day_15_25_10_16_LoopingStatement;

public class Example5 {

    public static void main(String[] args) {

        /*
         * 📘 Example 1: Calculate the sum of first 10 numbers
         * -----------------------------------------------------
         * Logic:
         * - Initialize sum = 0
         * - Loop from i = 1 to 1000
         * - Keep adding each number to sum
         * 
         * Formula (for quick math check): n(n+1)/2
         */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i; // sum += i;
        }

        System.out.println("Sum of first 10 numbers: " + sum);
        System.out.println("-----------------------------");

        /*
         * 📘 Example 2: Print numbers from 5 down to 1
         * --------------------------------------------
         * - Start from i = 5
         * - Decrease (i--) until i >= 1
         */

        for (int i = 5; i >= 1; i--) {
            // 5 >= 1 → true → prints 5
            // 4 >= 1 → true → prints 4
            // 3 >= 1 → true → prints 3
            // 2 >= 1 → true → prints 2
            // 1 >= 1 → true → prints 1
            // 0 >= 1 → false → loop stops
            System.out.print(i + " "); // Output: 5 4 3 2 1
        }

        System.out.println("\n-----------------------------");
        System.out.println("Reverse counting completed ✅");
    }

    // 🔹 Task for Practice:
    // Write a loop to print the squares of numbers from 1 to 10
    // Example Output: 1 4 9 16 25 36 49 64 81 100
}
