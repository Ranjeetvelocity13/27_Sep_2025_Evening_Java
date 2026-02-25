package Day_19_25_10_30_Loop;

public class Example8 {

    // Instance variable (each object has its own copy)
    int i = 10;

    // Static variable (shared among all objects of the class)
    static String className = "VCTC";

    // Non-static instance variable (unique for each object)
    String studentName;

    // Non-static method - can access both static and instance variables
    public void show() {
        System.out.println(studentName + " studies at " + className);
    }

    public static void main(String[] args) {

        /*
         * Example 8: Static vs Non-Static Variables
         * -----------------------------------------
         * - Static variables belong to the class, not to any specific object.
         * - Instance variables belong to each object separately.
         * - Static variables are shared and have only one copy in memory.
         * - Non-static variables are unique for each object.
         */

        // Creating object of Example8 class
        Example8 e8 = new Example8();

        // Assign value to instance variable
        e8.studentName = "Rohit";

        // Accessing non-static method using object
        e8.show();

        // Accessing static variable directly (without object)
        System.out.println("Institute Name: " + className);
    }

    // Non-static methods can access both static and instance members
    public void demo() {
        System.out.println("Instance variable i: " + i);
    }

    public void demo1() {
        System.out.println("Instance variable i: " + i);
    }
}
