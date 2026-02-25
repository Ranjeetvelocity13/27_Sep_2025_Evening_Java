package Day_38_25_11_25_ThisSuper_and_EH;

public class Program5 {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");

        // This line will throw ArithmeticException (division by zero)
        // When exception occurs → program stops → next lines do NOT execute
        System.out.println(10 / 0);  

        System.out.println("Hello");   // NOT executed
        System.out.println("Hello");   // NOT executed

        /*
         * EXCEPTION:
         * ----------
         * Exception is an unexpected event that interrupts the normal flow of a program.
         * In the above case, dividing by zero causes an ArithmeticException.
         *
         * Once exception occurs → program execution stops immediately.
         */

        /*
         * TYPES OF EXCEPTIONS IN JAVA
         * ---------------------------
         *
         * 1. Checked Exceptions
         *    - Checked at COMPILE TIME
         *    - Must be handled using try/catch OR throws keyword
         *    Examples:
         *      - IOException
         *      - SQLException
         *      - FileNotFoundException
         *      - InterruptedException
         *
         * 2. Unchecked Exceptions (Runtime Exceptions)
         *    - Checked at RUNTIME (not compile-time)
         *    - Occurs due to logical/programming mistakes
         *    Examples:
         *      - ArithmeticException
         *      - NullPointerException
         *      - ArrayIndexOutOfBoundsException
         *      - StringIndexOutOfBoundsException
         *      - ClassCastException
         *      - NumberFormatException
         *
         * 3. Errors
         *    - Serious issues, cannot be handled in Java code
         *    - Occur in JVM level
         *    Examples:
         *      - OutOfMemoryError
         *      - StackOverflowError
         */
    }
}
