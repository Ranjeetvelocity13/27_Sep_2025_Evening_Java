package Day_10_25_10_09_Method;

/*
 *  Example: Method with Parameters and Return Type (String)
 * ----------------------------------------------------------
 * - This program demonstrates how a method can take String parameters
 *   and return a String value (in this case, a full name).
 * 
 * - The method `getFullName` accepts first and last names as input,
 *   joins them, and returns the complete full name.
 */

public class Method22 {  // Class name should start with an uppercase letter

    public static void main(String[] args) {

        // Create an object of Method22 class to call the non-static method
        Method22 obj = new Method22();

        // Call the getFullName method with parameters and store the result
        String name1 = obj.getFullName("Rohit", "Patil");
        System.out.println("Full Name: " + name1);

        // Call the method again with different arguments
        String name2 = obj.getFullName("Rahul", "Patil");
        System.out.println("Full Name: " + name2);
    }
    /*
     * Method Name   : getFullName
     * Parameters    : String firstName, String lastName
     * Return Type   : String
     * Description   :
     * - This method combines the first name and last name with a space in between.
     * - It returns the resulting full name to the caller.
     * 
     * Syntax Reminder:
     * public returnType methodName(dataType param1, dataType param2) {
     *     // statements
     *     return value;
     * }
     */
    public String getFullName(String firstName, String lastName) {

        // Combine first and last name
        String fullName = firstName + " " + lastName;

        // Return the full name to the calling method
        return fullName;
    }
}
