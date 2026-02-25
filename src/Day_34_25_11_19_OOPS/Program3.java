package Day_34_25_11_19_OOPS;

public class Program3 extends Program2 {

    @Override
    public void Car() {
        System.out.println("Program3 -- Tata");
    }

    @Override
    public void Money() {
        System.out.println("Money -- 25 Lakh");
    }

    // final method → cannot be overridden further in next child classes
    @Override
    public final void Test() {
        System.out.println("Program3 test method");
    }

    public static void main(String[] args) {

        System.out.println("----- Parent Object (Compile-Time Binding) -----");
        Program2 P2 = new Program2(); // Static binding
        P2.Car();   // Parent method
        P2.Money(); // Parent method
        P2.Home();  // Parent method
        P2.Test();  // Parent Test()

        System.out.println();

        System.out.println("----- Child Object (Compile-Time Binding) -----");
        Program3 P3 = new Program3(); // Static binding
        P3.Car();    // Child overridden method
        P3.Money();  // Child overridden method
        P3.Test();   // Child final method (cannot override further)
        P3.Home();   // Inherited parent method

        System.out.println();

        System.out.println("----- Upcasting (Runtime Polymorphism) -----");
        Program2 P4 = new Program3(); // Upcasting / Runtime Polymorphism

        P4.Car();     // Child method (overridden)
        P4.Money();   // Child method (overridden)
        P4.Home();    // Parent method
        P4.Test();    // Child Test() method (because it is overridden)

        /*
         NOTE:
         - Upcasting allows calling ONLY those methods available in parent class.
         - But overridden methods will execute child's version at runtime.
         - Test() is accessible because it exists in Program2 and Program3 overrides it.
         */

        System.out.println();

        // ❌ Downcasting - INVALID: ClassCastException at runtime
        // Program3 p5 = (Program3) new Program2(); // INVALID DOWNCAST
        // p5.Car(); // Runtime Error

 
    }
}
