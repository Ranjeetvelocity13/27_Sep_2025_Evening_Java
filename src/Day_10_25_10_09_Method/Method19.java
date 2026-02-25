package Day_10_25_10_09_Method;

public class Method19 {

    public static void main(String[] args) {
        /*
         * Method with parameters and return type
         * --------------------------------------------------------
         * - Takes input values (parameters)
         * - Performs some calculation or operation
         * - Returns a value back to the calling method using the 'return' keyword
         * 
         * General Syntax:
         * 
         *     public returnType methodName(dataType param1, dataType param2) {
         *         // Statements or logic
         *         return value;  // must match returnType
         *     }
         */

        // Create an object of Method19 class to call non-static methods
    	Method19 m19 = new Method19();

        // Call the addition method and store the returned result
        int result1 = m19.addition(10, 20);
        System.out.println("Addition Result -- " + result1);

        // Calling the same method again with different arguments
        int result2 = m19.addition(40, 30);
        System.out.println("Addition Result -- " + result2);

        // Displaying the total of both results
        System.out.println("Sum of both results -- " + (result1 + result2));
    }

    /*
     * Method: addition
     * -----------------
     * Parameters: int a, int b
     * Returns: int (sum of a and b)
     * This method takes two integers as input, adds them,
     * and returns the calculated sum to the caller.
     */
    public int addition(int a, int b) {
        int sum = a + b;  // Perform addition
        return sum;       // Return the result
    }
}
