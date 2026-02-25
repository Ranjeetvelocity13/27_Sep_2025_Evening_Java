package Day_34_25_11_19_OOPS;

public class Program1 {

    public static void main(String[] args) {

        Program1 M9 = new Program1();  // static binding / CTP

        M9.Test(10, 10.8f);   // Calls Test(int, float)
        M9.Test(12.5f, 10);   // Calls Test(float, int)

        // ❌ CTE Reason 1: Ambiguity
        // M9.Test(10,20);
        /**
         * 10 → int
         * 20 → int
         *
         * Compiler tries to match (int, int) with available methods:
         *
         *   1. Test(int, float)
         *          - Needs conversion: 20 -> float
         *
         *   2. Test(float, int)
         *          - Needs conversion: 10 -> float
         *
         * Both require **one conversion**, and compiler cannot decide which
         * method should be called → AMBIGUITY.
         *
         * ❌ Result → Compile-Time Error: "The method Test(...) is ambiguous"
         */


        // ❌ CTE Reason 2: No Suitable Method Found
        // M9.Test(10.4f, 19.5f);
        /**
         * 10.4f  → float
         * 19.5f → float
         *
         * No method exists with signature: Test(float, float)
         *
         * Available:
         *   Test(int, float)   → would require narrowing (float → int) ❌ Not allowed
         *   Test(float, int)   → would require narrowing (float → int) ❌ Not allowed
         *
         * Java does NOT perform narrowing automatically (float → int).
         * Therefore, NO valid method can be selected.
         *
         * ❌ Result → Compile-Time Error: "No suitable method found"
         */
    }

    // Method 1
    public void Test(int i, float j) {
        System.out.println("int float method");
    }

    // Method 2
    public void Test(float j, int i) {
        System.out.println("float int method");
    }
}
