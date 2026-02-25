package Day_10_25_10_09_Method;

public class Method21 {  // Class names should start with uppercase letters (Java naming convention)

    public static void main(String[] args) {
        /*
         * Example: Method with Parameters and Return Type
         * ---------------------------------------------------
         * - Takes input values (parameters)
         * - Performs some operation (finds average)
         * - Returns a result (average value) to the calling method
         * 
         * Syntax:
         * public returnType methodName(dataType param1, dataType param2, ...) {
         *     // logic or statements
         *     return value; // value must match returnType
         * }
         */

        // Create an object of Method21 to call the non-static method
        Method21 m21 = new Method21();

        // Call the method and store the returned average
        double avg = m21.findAverage(20, 10, 10);

        // Print the average value
        System.out.println("Average = " + avg);
    }

    /*
     * Method Name  : findAverage
     * Parameters   : int a, int b, int c
     * Return Type  : double
     * 
     * Description  :
     * This method calculates the average of three integer numbers.
     * The division is done by 3.0 (not 3) to ensure the result is a double
     * — giving a more accurate floating-point result.
     */
    public double findAverage(int a, int b, int c) {

        // Perform the average calculation
        double average = (a + b + c) / 3.0;

        // Return the result to the calling method
        return average;
    }
}
