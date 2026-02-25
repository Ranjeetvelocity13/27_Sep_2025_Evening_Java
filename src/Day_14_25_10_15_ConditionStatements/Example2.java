package Day_14_25_10_15_ConditionStatements;

public class Example2 {

    /*
     * 🔹 if-else Statement
     * 
     * Used when we want either one block or the other to execute.
     * 
     * → Executes the 'if' block if condition is true,
     *   otherwise executes the 'else' block.
     * 
     * Syntax:
     * if (condition) {
     *     // executes if condition is true
     * } else {
     *     // executes if condition is false
     * }
     */

    public static void main(String[] args) {

        System.out.println("Program started");
        System.out.println("-----------------------");

        // 1️⃣ Example - Even or Odd Number
        int number = 9;

        if (number % 2 == 0) {  // 9 % 2 == 0 → false
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("-----------------------");

        // 2️⃣ Example - Age Verification
        int age = 16;

        if (age >= 18) {  // 16 >= 18 → false
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.println("-----------------------");

        // 3️⃣ Example - Login Access (String Comparison)
        String password = "12345";

        // Always use .equals() for string comparison in Java
        if (password.equals("12345")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        System.out.println("-----------------------");

        // 4️⃣ Example - Check if Number is Positive or Negative
        int a = -5;

        if (a >= 0) {  // -5 >= 0 → false
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        System.out.println("-----------------------");

        // 5️⃣ Example - Discount Eligibility (Real-life case)
        double billAmount = 1200.50;

        if (billAmount > 1000) {
            System.out.println("You get a 10% discount!");
        } else {
            System.out.println("No discount available.");
        }

        System.out.println("Program ended");
    }
}
