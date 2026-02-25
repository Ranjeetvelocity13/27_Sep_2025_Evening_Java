package Day_10_25_10_09_Method;

/*
 * Example: Difference between void and return-type methods
 * -----------------------------------------------------------
 * - A **void method** performs an action but does NOT return any value.
 * - A **return-type method** performs an action and RETURNS a value to the caller using the `return` keyword.
 */

public class Method23 {  // Class name should start with uppercase (Java naming convention)

    public static void main(String[] args) {

        // Create an object to call non-static methods
        Method23 m23 = new Method23();

        // Call the void method (doesn't return any value)
        m23.greet();

        // Call the return-type method and store the result
        int result = m23.getNumber();

        // Print the returned value
        System.out.println("Returned value: " + result);
    }
    /*
     * Method: greet()
     * Type: void (does not return anything)
     * Description:
     * - Prints a welcome message.
     * - Demonstrates that a void method performs an action but doesn’t return data.
     */
    public void greet() {
        System.out.println("Hello, Welcome to Automation Testing Classes!");

        // You can still call another method inside it (example below)
        Method23 m24 = new Method23();
        m24.getNumber();  // Calling a return-type method from within a void method
    }
    /*
     * Method: getNumber()
     * Type: return-type method (returns int)
     * Description:
     * - This method returns an integer value (10).
     * - Demonstrates how to return data back to the caller.
     */
    public int getNumber() {
        return 10;  // Sends the value 10 back to the caller
    }
}
