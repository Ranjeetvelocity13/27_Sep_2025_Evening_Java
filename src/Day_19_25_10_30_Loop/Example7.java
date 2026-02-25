package Day_19_25_10_30_Loop;

public class Example7 {

    // Instance Variables (also called Non-static or Global Variables)
    // These are declared inside the class but outside any method or constructor.
    // Each object of the class gets its own copy of instance variables.
    String name = "Rahul";  // instance variable (default value: null)
    int age = 10;            // instance variable (default value: 0)

    public static void main(String[] args) {

        /*
         * Example 7: Instance (Non-static) Variables
         * ------------------------------------------
         * - Declared inside the class but outside all methods and constructors.
         * - Each object gets its own copy.
         * - They are initialized when the object is created.
         * - Can be accessed using the object reference.
         */

        // Create an object of the class
        Example7 E7 = new Example7();

        // Access instance variables using a non-static method
        E7.show();
    }

    // Non-static method can directly access instance variables
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Static method example (cannot access instance variables directly)
    public static void Test() {
        // System.out.println(name); // Invalid - needs an object reference
        // System.out.println(age);
    }
}
