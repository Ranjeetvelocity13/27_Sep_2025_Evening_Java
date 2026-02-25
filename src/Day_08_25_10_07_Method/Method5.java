package Day_08_25_10_07_Method;  // Package declaration

// This class contains a static method that will be called from another class (method4)
public class Method5 {

    // Main method (optional in this case — not required unless you want to run this file independently)
    public static void main(String[] args) {
        // We can call the static method here directly too
        differentClass();
    }

    // Static method definition
    public static void differentClass() {
        System.out.println("Static regular method calling from a DIFFERENT class");
    }
}
