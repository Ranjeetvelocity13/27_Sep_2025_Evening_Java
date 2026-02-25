package Day_18_25_10_29_WhileLoop;

public class Example3 {

    public static void main(String[] args) {

        /*
         * 📘 Example 3: While Loop
         * ------------------------
         * Syntax:
         * while (condition) {
         *     // code to be executed repeatedly
         * }
         *
         *  The while loop continues executing the code
         *    as long as the condition is TRUE.
         *  If the condition is FALSE at the start, it never executes.
         */

        // 1️⃣ Print numbers from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        System.out.println("**********************");

        // 2️⃣ Print numbers from 10 to 1 (Reverse Order)
        int num = 10;
        while (num >= 1) {
            System.out.print(num + " ");
            num--;
        }

        System.out.println();
        System.out.println("**********************");

        // 3️⃣ Print even numbers from 1 to 20
        int n = 1;
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        
        System.out.println();
        System.out.println("**********************");

        // 4️⃣ Print whether numbers from 1 to 20 are even or odd
        int n2 = 1;
        while (n2 <= 20) {
            if (n2 % 2 == 0) {
                System.out.println(n2 + " is even");
            } else {
                System.out.println(n2 + " is odd");
            }
            n2++;
        }

        System.out.println("**********************");

        // 5️⃣ Print multiplication table of 7
        int i2 = 1;
        while (i2 <= 10) {
            System.out.println("7 x " + i2 + " = " + (7 * i2));
            i2++;
        }

        System.out.println("**********************");
        System.out.println("Program executed successfully ✅");
    }
}
