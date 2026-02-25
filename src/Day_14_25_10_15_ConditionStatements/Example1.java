package Day_14_25_10_15_ConditionStatements;

public class Example1 {

    // Conditional Statements in Java
    // Definition: Conditional statements in Java allow the program to make decisions
    // and execute different blocks of code depending on whether a condition is true or false.

    /*
     * Why We Use Conditional Statements:
     * 1. To control program flow based on specific conditions.
     * 2. To avoid code repetition and make logic more readable.
     *
     * Types of Conditional Statements:
     * 1. if statement
     * 2. if-else statement
     * 3. if-else-if ladder
     * 4. nested if statement
     * 5. switch statement
     *
     * → if statement:
     * The simplest conditional statement.
     * Executes a block only if the condition is true.
     * If the condition is false, the block is skipped.
     *
     * Syntax:
     * if (condition) {
     *     // code to be executed if condition is true
     * }
     */

    public static void main(String[] args) {
        System.out.println("Program started");
        // 1️⃣ Check voting eligibility
        int age = 20;
        if (age >= 18) {  // 20 >= 18 → true
            System.out.println("Eligible to vote");
        }
        System.out.println("-----------------------");

        // 2️⃣ Check positive number
        int num = 10;
        if (num > 0) { // 10 > 0 → true
            System.out.println("Number is positive");
        }
        System.out.println("-----------------------");

        // 3️⃣ Check login success
        String username = "admin1";
        // Use .equals() for string comparison instead of '=='
        if (username.equals("admin")) {
            System.out.println("Login successful");
        }
        System.out.println("-----------------------");

        // 4️⃣ Check if student passed
        int marks = 45;
        if (marks >= 40) { // 45 >= 40 → true
            System.out.println("Student passed the exam");
        }
        System.out.println("-----------------------");
        // 5️⃣ Temperature check (real-life condition)
        int temperature = 35;
        if (temperature > 30) { // 35 > 30 → true
            System.out.println("It’s a hot day!");
        }
        System.out.println("Program ended");
    }
}
