package Day_33_25_11_18_OOPS;

public class Program7 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Test");
        String s1 = new String("Test");

        Program7 p7 = new Program7();

        p7.Demo("Test");    // Calls Demo(String)
        p7.Demo("FF");      // Calls Demo(String)
        p7.Demo(sb);        // Calls Demo(StringBuffer)

        // p7.Demo(null);  // Compile-time error (AMBIGUOUS)
        /*
         * Why Demo(null) is ambiguous?
         *
         * - null can be passed to any reference type.
         * - Here we have two overloaded methods:
         *       Demo(String)
         *       Demo(StringBuffer)
         *
         * - Java tries to choose the MOST SPECIFIC type.
         *
         * BUT:
         *   String and StringBuffer are NOT related by inheritance.
         *
         *   Object
         *     |--- String
         *     |--- StringBuffer
         *
         * - Since both are equal-level subclasses of Object,
         *   neither is more specific than the other.
         *
         * Therefore:
         *   The compiler cannot decide which method to call.
         *   → Result = Ambiguous method call error.
         */
    }

    // Overloaded method for String type
    public void Demo(String str) {
        System.out.println("String method calling");
    }

    // Overloaded method for StringBuffer type
    public void Demo(StringBuffer str) {
        System.out.println("StringBuffer method calling");
    }
}
