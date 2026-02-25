package Day_11_25_19_10_Operators;

public class Unary {

    public static void main(String[] args) {

        // ==============================
        // 1. Unary Operators
        // ==============================
        // Unary operators perform an operation on a single operand.
        // Example: ++ (increment), -- (decrement)

        int x = 5;

        System.out.println("Original x = " + x);

        System.out.println("Increment by one (Post-increment): " + (x++));
        System.out.println("After post-increment: " + x);

        System.out.println("Decrement by one (Post-decrement): " + (x--));
        System.out.println("After post-decrement: " + x);

        // x = x + 5; // Same as x += 5;

        // ==============================
        // 2. Relational (Comparison) Operators
        // ==============================
        /*
         * ==   → Equal to
         * !=   → Not equal to
         * >    → Greater than
         * <    → Less than
         * >=   → Greater than or equal to
         * <=   → Less than or equal to
         * 
         * These operators return boolean results: true or false
         */

        int a = 10, b = 20;

        System.out.println("\n--- Relational Operators ---");
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a <= b);  // true
        System.out.println(a >= b);  // false

        // ==============================
        // 3. Logical Operators
        // ==============================
        /*
         * Logical AND (&&)
         * true  && true  → true
         * true  && false → false
         * false && true  → false
         * false && false → false
         * 
         * Logical OR (||)
         * true  || true  → true
         * true  || false → true
         * false || true  → true
         * false || false → false
         */

        System.out.println("\n--- Logical Operators ---");

        int j = 10, k = 5, l = 20;

        System.out.println((j > k) && (j > l));  // true && false → false
        System.out.println((j > k) && (l > k));  // true && true  → true

        System.out.println((j > k) || (j > l));  // true || false → true
        System.out.println((j < k) || (l < k));  // false || false → false
    }
}
