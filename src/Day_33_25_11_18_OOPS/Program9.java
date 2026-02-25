package Day_33_25_11_18_OOPS;

public class Program9 {

    public static void main(String[] args) {

        // Can we overload a method by changing ONLY the return type?
        // → NO, we cannot.

        /*
         * Why return type alone is NOT enough for method overloading?
         *
         * Overloading depends ONLY on:
         *   ✔ Method name
         *   ✔ Parameter types
         *   ✔ Number of parameters
         *   ✔ Order of parameters
         *
         * Return type is NOT part of the method signature.
         *
         * If we try to overload by changing only the return type,
         * the compiler will get confused because BOTH methods look identical
         * when calling them:
         *
         * Example:
         *     int x = m1();
         *     String y = m1();
         *
         * The compiler cannot decide which m1() to call,
         * because both have the SAME parameter list.
         *
         * Therefore:
         *     Overloading by changing only return type = NOT allowed.
         */

        System.out.println("Return type alone cannot overload a method.");
    }

    /*
    //  Not allowed: same method name and same parameters
    public int m1() {
        return 10;
    }

    // Compiler error: method m1() is already defined
    public String m1() {
        return "Test";
    }
    */
}
