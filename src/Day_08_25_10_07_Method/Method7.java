package Day_08_25_10_07_Method;  // Package declaration

public class Method7 {

    // Main method — program execution starts here
    public static void main(String[] args) {

        // Calling Static Methods from a DIFFERENT class
        System.out.println("Different class methods:");

        // Calling static methods of method6 class using ClassName.methodName()
        Method6.Demo1();
        Method6.Demo2();
        Method6.Demo3();

        System.out.println(); // Blank line for better readability

        // Calling Static Methods from the SAME class
        System.out.println("Same class methods:");

        // You can call using ClassName.methodName()
        Method7.div();
        Method7.Mul();
        Method7.Sum1();

        // Or (since we are inside the same class), you can also call them directly:
        // div();
        // Mul();
        // Sum1();
    }
    // Static Method 1
    public static void Sum1() {
        System.out.println("Sum method");
    }
    // Static Method 2
    public static void Mul() {
        System.out.println("Mul method");
    }
    // Static Method 3
    public static void div() {
        System.out.println("Div method");
    }
}
