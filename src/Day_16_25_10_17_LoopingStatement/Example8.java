package Day_16_25_10_17_LoopingStatement;

public class Example8 {

    public static void main(String[] args) {

        /*
         * 📘 Example 8: Prime Number Check
         * ---------------------------------
         * A prime number is a number greater than 1
         * that is divisible only by 1 and itself.
         *
         * Example:
         * Prime numbers → 2, 3, 5, 7, 11, 13, 17, 19...
         *
         * Logic:
         * 1️⃣ Start from i = 2
         * 2️⃣ Check if the number is divisible by any i
         * 3️⃣ If divisible → Not Prime (break loop)
         * 4️⃣ If loop completes → Prime
         */

        int num = 17; // number to check
        int i;

        // Check divisibility from 2 to num-1
        for (i = 2; i < num; i++) {
            if (num % i == 0) { // divisible → not prime
                break;
            }
        }

        // After loop ends, check value of i
        if (i == num) {
            System.out.println(num + " is a Prime Number ");
        } else {
            System.out.println(num + " is NOT a Prime Number ");
        }
    }
}
