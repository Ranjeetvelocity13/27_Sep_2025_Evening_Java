package Day_38_25_11_25_ThisSuper_and_EH;

public class Program6 {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            // Risky code (may cause exception)
            int a = 10 / 2;  // No exception here (result = 5)
            System.out.println("Result: " + a);

        } catch (ArithmeticException e) {
            // Handling exception (if division by zero occurs)
            System.out.println("Error - Cannot divide by zero");
        }

        System.out.println("Program Ended");
    }

    /*
     * WHY EXCEPTION HANDLING IS REQUIRED?
     * -----------------------------------
     *
     * 1. Preventing Program Crashes
     *    - Without try/catch, any exception will stop the entire program.
     *
     * 2. Handling Errors Gracefully
     *    - We can manage errors and continue program execution.
     *
     * 3. Maintaining Normal Program Flow
     *    - Program continues even if an error occurs.
     *
     * 4. Displaying Meaningful Error Messages
     *    - Instead of JVM error messages, we show user-friendly messages.
     *
     * 5. Helps in Debugging
     *    - Catch blocks help identify exactly what went wrong.
     *
     */
}
