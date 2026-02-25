package Day_07_25_10_06_Method;

public class Method1 {

    public static void main(String[] args) {

        System.out.println("Main method started");

        // Built-in method examples
        System.out.println("Hello");
        System.out.println("Hi");

        // Example of using Math class built-in method
        int result = (int) Math.sqrt(25);
        System.out.println("Square root of 25 is: " + result);

        // User-defined methods
        // Direct calling since methods are static
        test1();
        test2();

        System.out.println("Main method ended");
    }

    // Static method 1
    public static void test1() {
        System.out.println("Static method test1 executed");
    }

    // Static method 2
    public static void test2() {
        System.out.println("Static method test2 executed");
    }
}