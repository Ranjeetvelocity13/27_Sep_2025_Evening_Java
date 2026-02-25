package Day_33_25_11_18_OOPS;

public class Program6 {

    public static void main(String[] args) {

        Object obj = new Object();

        Program6 p6 = new Program6();

        p6.Demo(obj);       // Calls Object method
        p6.Demo("Java");    // Calls String method
        p6.Demo(null);      // Calls String method (most specific)

        /*
         * Why Demo(null) calls Demo(String)?
         *
         * - null can match any reference type (Object, String, etc.)
         * - When Java sees multiple matching overloaded methods,
         *   it chooses the MOST SPECIFIC datatype.
         *
         * - String is a subclass of Object.
         *   Therefore, String is more specific than Object.
         *
         * So the compiler chooses:
         *     Demo(String str)
         */
    }

    // Method 1: accepts any Object
    public void Demo(Object obj) {
        System.out.println("Object method calling");
    }

    // Method 2: more specific → accepts only String
    public void Demo(String str) {
        System.out.println("String method calling");
    }
}
