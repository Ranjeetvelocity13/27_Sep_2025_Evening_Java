package Day_18_25_10_29_WhileLoop;

public class Example4 {

    public static void main(String[] args) {

        /*
         * 📘 Example 4: While Loop – Practical Use Cases
         * ----------------------------------------------
         * The while loop is used when we want to repeat a task
         * until a specific condition becomes false.
         *
         * Examples covered:
         * 1️⃣ Calculate sum of first 10 numbers
         * 2️⃣ Count how many numbers (1–35) are divisible by 3
         * 3️⃣ Calculate factorial of a number
         */

        // 1️⃣ Calculate sum of first 10 numbers
        int i3 = 1, sum = 0;

        while (i3 <= 10) {
            sum = sum + i3; // add current value to sum
            i3++;           // increment counter
        }

        System.out.println("Sum of first 10 numbers = " + sum);
        System.out.println("---------------------------------");

        // 2️⃣ Count how many numbers (1 to 35) are divisible by 3
        int i4 = 1, count = 0;

        while (i4 <= 35) {
            if (i4 % 3 == 0) { // check if divisible by 3
                count++;
            }
            i4++;
        }

        System.out.println("Numbers divisible by 3 (1–35) = " + count);
        System.out.println("---------------------------------");

        // 3️⃣ Find factorial of a number using while loop
        int num = 5;
        int fact = 1;
        int j = 1;

        while (j <= num) {
            fact = fact * j; // multiply progressively
            j++;
        }

        System.out.println("Factorial of " + num + " = " + fact);
        System.out.println("---------------------------------");

        System.out.println("Program executed successfully ");
    }
}
