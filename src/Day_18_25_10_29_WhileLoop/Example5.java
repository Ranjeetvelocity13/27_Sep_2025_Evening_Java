package Day_18_25_10_29_WhileLoop;

public class Example5 {

    public static void main(String[] args) {

        /*
         * 📘 Example 5: While Loop – Multiple Real-Time Examples
         * ------------------------------------------------------
         * Covered examples:
         * 1️⃣ Reverse a number
         * 2️⃣ Print alphabets A–Z
         * 3️⃣ Find sum of even and odd numbers (1–20)
         */

        // 1️⃣ Reverse a number
        int number = 123;
        int rev = 0;

        /*
         * Logic:
         * - Extract each digit using modulus (%)
         * - Add it to rev after shifting digits left (rev * 10)
         * - Remove last digit using division (/)
         *
         * Example:
         * number = 123
         * Step 1 → digit = 3 → rev = 0 * 10 + 3 = 3
         * Step 2 → digit = 2 → rev = 3 * 10 + 2 = 32
         * Step 3 → digit = 1 → rev = 32 * 10 + 1 = 321
         */

        while (number != 0) {
            int digit = number % 10;     // extract last digit
            rev = rev * 10 + digit;      // build reversed number
            number = number / 10;        // remove last digit
        }

        System.out.println("Reversed number = " + rev);
        System.out.println("-----------------------------------");

        // 2️⃣ Print alphabets A to Z
        char ch = 'A';
        System.out.print("Alphabets from A to Z: ");
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println();
        System.out.println("-----------------------------------");

        // 3️⃣ Print sum of even and odd numbers (1 to 20)
        int i5 = 1, evenSum = 0, oddSum = 0;

        while (i5 <= 20) {
            if (i5 % 2 == 0)
                evenSum += i5;  // add even numbers
            else
                oddSum += i5;   // add odd numbers
            i5++;
        }

        System.out.println("Sum of Even numbers (1–20): " + evenSum);
        System.out.println("Sum of Odd numbers  (1–20): " + oddSum);
        System.out.println("-----------------------------------");

        System.out.println("Program executed successfully ");
    }
}
