package Day_35_25_11_20_OOPS;

public class AbstractionConcept {

    public static void main(String[] args) {

        // Abstraction:
        // It is the process of hiding implementation details 
        // and showing only important functionality to the user.

        // Abstract Class:
        // A class declared using the 'abstract' keyword.
        // It can contain:
        // ✔ Complete Methods (with body)
        // ✔ Incomplete Methods (abstract methods)

        // Two ways to achieve abstraction:
        // 1. Abstract Class (0% to 100% abstraction)
        // 2. Interface (100% abstraction)

        // Rules of Abstract Class:
        // ✔ Can contain abstract + non-abstract methods
        // ✔ Cannot be instantiated
        // ✔ Can have constructors
        // ✔ Can have static & final methods
        // ✔ Child class must implement all abstract methods
    }

    public void method1() {
        System.out.println("Non-abstract method: method1");
    }

    public void method2() {
        System.out.println("Non-abstract method: method2");
    }
}
