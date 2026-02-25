package Day_15_25_10_16_LoopingStatement;

public class Example3 {

    public static void main(String[] args) {

        /*
         * 🔁 Looping Statements in Java
         * ------------------------------
         * A loop in Java is used to execute a block of code repeatedly
         * until a specific condition becomes false.
         *
         * ✅ Why do we use loops?
         * - To avoid code repetition
         * - To perform tasks multiple times automatically
         * - To execute test steps repeatedly in automation
         *
         * 📘 Types of Loops in Java:
         * 1. for loop
         * 2. while loop
         * 3. do-while loop
         * 4. for-each loop (Enhanced for loop)
         *
         * -------------------------------
         * 🧩 for loop - most commonly used loop
         *
         * Syntax:
         * for(initialization; condition; increment/decrement) {
         *      // code to execute
         * }
         *
         * - Initialization → runs once at the start
         * - Condition → checked before each iteration
         * - Increment/Decrement → updates the loop variable
         */

        // Example 1 — Print numbers from 1 to 5
        System.out.println("Example 1: Print numbers from 1 to 5");

        for (int i = 1; i <= 5; i++) {
            // 1 <= 5 → true → prints 1
            // 2 <= 5 → true → prints 2
            // 3 <= 5 → true → prints 3
            // 4 <= 5 → true → prints 4
            // 5 <= 5 → true → prints 5
            // 6 <= 5 → false → loop stops
            System.out.println(i);
        }

        System.out.println("For loop completed ✅");
        System.out.println("------------------------------");

        // Example 2 — Print even numbers from 2 to 10
        System.out.println("Example 2: Print even numbers from 2 to 10");

        for (int i = 2; i <= 10; i = i + 2) {
            // Starts at 2, increases by 2 each time
            // Prints: 2, 4, 6, 8, 10
            System.out.println(i);
        }

        System.out.println("Even numbers printed successfully ✅");
    }
}
