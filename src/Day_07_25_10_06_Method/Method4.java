package Day_07_25_10_06_Method;  // Package declaration

import Day_08_25_10_07_Method.Method5;

public class Method4 {

    // Main method — execution starts here
    public static void main(String[] args) {

        System.out.println("Program started");

        //  Calling static method from the SAME class

        // Direct calling — only method name (since both are in the same class)
        sameClass();

        // Calling using class name (optional but valid)
        Method4.sameClass();

        // Calling static method from a DIFFERENT class

        // Direct calling ( Not allowed)
        // differentClass();  // This will give an error because it belongs to another class

        // Correct way — using class name
        Method5.differentClass();   // Static method of another class

        System.out.println("Program ended");
    }
    
    // Static regular method inside same class
    public static void sameClass() {
        System.out.println("Static regular method called from the SAME class");
    }

}
