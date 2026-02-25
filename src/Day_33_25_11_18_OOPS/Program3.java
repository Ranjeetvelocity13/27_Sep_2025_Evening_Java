package Day_33_25_11_18_OOPS;

public class Program3 {

    public static void main(String[] args) {

        Program3 p3 = new Program3();

        // Calling overloaded methods
        p3.name();                  // Zero-parameter method
        p3.name(10, "Test");        // int, String parameter
        p3.name("Test", 20);        // String, int parameter
        p3.name("Test");            // Single String parameter
        p3.name(10);                // Single int parameter
    }

    // Method Overloading Example

    // 1. Zero-parameter method
    public void name() {
        System.out.println("Zero input parameter method");
    }

    // 2. One int parameter
    public void name(int i) {
        System.out.println("One int parameter method");
    }

    // 3. One String parameter
    public void name(String i) {
        System.out.println("One String parameter method");
    }

    // 4. Two parameters → String first, int second
    public void name(String s1, int i1) {
        System.out.println("Two-parameter method (String, int)");
    }

    // 5. Two parameters → int first, String second
    public void name(int i, String s2) {
        System.out.println("Two-parameter method (int, String)");
    }
}
