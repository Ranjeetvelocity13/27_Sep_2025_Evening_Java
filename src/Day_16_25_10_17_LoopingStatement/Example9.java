package Day_16_25_10_17_LoopingStatement;

public class Example9 {

    public static void main(String[] args) {

        /*
         * 📘 Example 9: Armstrong Number
         * -------------------------------
         * Definition:
         * An Armstrong number (also known as a narcissistic number) 
         * is a number that is equal to the sum of the cubes of its digits.
         *
         * Example:
         * 153 → (1³ + 5³ + 3³ = 1 + 125 + 27 = 153)  Armstrong number
         * 123 → (1³ + 2³ + 3³ = 1 + 8 + 27 = 36)  Not an Armstrong number
         */

        int num = 153;               // number to check
        int originalNumber = num;    // store original value for comparison
        int sum = 0;                 // variable to hold the sum of cubes
        int rem;                     // variable to store each digit

        // Loop to extract digits and calculate cube sum
        while (num > 0) {
            rem = num % 10;               // extract last digit
            sum = sum + (rem * rem * rem); // add cube of the digit to sum
            num = num / 10;               // remove last digit
        }

        // Check if number is Armstrong
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }
    }
}
