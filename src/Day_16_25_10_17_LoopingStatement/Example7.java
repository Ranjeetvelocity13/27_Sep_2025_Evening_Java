package Day_16_25_10_17_LoopingStatement;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        /*
         * 📘 Example 7: Check if a Year is a Leap Year
         * ---------------------------------------------
         * Leap Year Rules:
         * A year is a leap year if:
         * 1️⃣ It is divisible by 4, AND not divisible by 100
         *          OR
         * 2️⃣ It is divisible by 400
         *
         * Examples:
         * 2020 → Leap year (divisible by 4, not by 100)
         * 1900 → Not a leap year (divisible by 100 but not 400)
         * 2000 → Leap year (divisible by 400)
         * 2024 → Leap year
         */

        //  Option 1: Using fixed value
        int year = 2024;

        //  Option 2: Uncomment below lines to allow user input
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        */

        // Check leap year condition
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year ");
        } else {
            System.out.println(year + " is NOT a Leap Year ");
        }

        //System.out.println("Program executed successfully!");
    }
}
