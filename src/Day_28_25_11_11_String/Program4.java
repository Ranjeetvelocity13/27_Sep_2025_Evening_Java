package Day_28_25_11_11_String;

public class Program4 {

    public static void main(String[] args) {

        // ==============================================
        // 1️⃣ String Literals and Immutability Example
        // ==============================================

        String S1 = "Java";  // Stored in String Constant Pool (SCP)
        String S2 = "Java";  // Points to the same SCP object as S1
        String S3 = "Java";  // Also points to same SCP object

        // Now modify S2 by assigning a new value
        S2 = "Python"; // Creates a new object in SCP, doesn't change "Java"

        // Print values
        System.out.println("Value of S2 after modification: " + S2);
        System.out.println("Value of S1: " + S1);
        System.out.println("Value of S3: " + S3);

        System.out.println("----------------------------------------------");

        /*
         * Explanation:
         * - Initially, S1, S2, and S3 all point to the same SCP object "Java".
         * - When we reassign S2 = "Python", a NEW object "Python" is created in SCP.
         * - S2 now points to "Python".
         * - S1 and S3 still point to the original "Java" object.
         * - The original string "Java" remains unchanged (immutability).
         */

        // ==============================================
        // 2️⃣ Key Concepts Recap
        // ==============================================

        // Types of String creation:
        // 1. Using String Literal (stored in SCP)
        // 2. Using new Keyword (stored in Heap Memory)

        // String Memory Areas:
        // - SCP (String Constant Pool)
        // - Heap Memory

        // Comparison:
        // - ==  → Reference comparison (memory address)
        // - .equals() → Content comparison (value)

        // Immutability:
        // - Once created, a String object cannot be changed.
        // - Any modification creates a new object in memory.
    }
}
