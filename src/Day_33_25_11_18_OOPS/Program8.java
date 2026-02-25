package Day_33_25_11_18_OOPS;

public class Program8 {

    public static void main(String[] args) {

        // Can we overload the main() method? → YES
        // Can we overload a private method? → YES
        // Can we overload a final method? → YES
        //
        // NOTE:
        // Overloading has NOTHING to do with access modifiers or final keyword.
        // Only method signature (parameter list) matters.

        System.out.println("String[] main method");

        Program8.main('c');     // Calls main(char)
        Program8.main("Java");  // Calls main(String)
        Program8.main(10);      // Calls main(int)
    }

    // Overloaded main method with int parameter
    public static void main(int test) {
        System.out.println("Int input param method");
    }

    // Overloaded main method with String parameter
    public static void main(String test) {
        System.out.println("String input param method");
    }

    // Overloaded main method with char parameter
    public static void main(char test) {
        System.out.println("Char input param method");
    }

    /*
     * ===========================
     * Overloading Private Methods
     * ===========================
     * YES, private methods CAN BE overloaded.
     * Because overloading depends ONLY on:
     *   - number of parameters
     *   - type of parameters
     *   - order of parameters
     *
     * Access modifiers DO NOT affect overloading.
     */

    private static void main(int i, int j) {
        // private overloaded main
    }

    private static void main(int i, int j, int k) {
        // private overloaded main
    }

    /*
     * ===========================
     * Overloading Final Methods
     * ===========================
     * YES, final methods CAN BE overloaded.
     *
     * final prevents overriding (in child class),
     * but DOES NOT prevent overloading within the same class.
     */

    private final static void main(int i, int j, int k, int jj) {
        // final overloaded main
    }

    private final static void main(String i, int j, int k, int jj) {
        // final overloaded main with different params
    }

}
