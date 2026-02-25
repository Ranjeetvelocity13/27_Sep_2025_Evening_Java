package Day_07_25_10_06_Method;  // Package declaration

import Day_08_25_10_07_Method.Method7;

public class staticMethodExample {

    // A static method belongs to the class, not to an object.
    // It can be called without creating an object of the class.

    // Static Method 1
    public static void displaySchoolInfo() {
        System.out.println("Welcome to ABC International School");
        System.out.println("This is a static method example");
    }

    // Static Method 2
    public static void showRules() {
        System.out.println("1. Be on time to class");
        System.out.println("2. Complete your assignments");
        System.out.println("3. Respect your teachers");
    }

    // Main method — Program execution starts here
    public static void main(String[] args) {

        System.out.println("====== Program Started ======");

        //️⃣ Calling Static Methods from the SAME class
        // Since methods are static, we can call them directly without creating an object.
        displaySchoolInfo();
        showRules();

        // Calling Static Method from a DIFFERENT class
        // Must be called using ClassName.methodName()
        Method7.Sum1();   // Static method from method7 class
        
        System.out.println("====== Program Ended ======");
    }
}
