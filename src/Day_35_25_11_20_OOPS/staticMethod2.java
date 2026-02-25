package Day_35_25_11_20_OOPS;

public class staticMethod2 extends StaticMethod1 {

    // =======================================================
    // This is true overriding (non-static method)
    // Dynamic Binding → Which method runs depends on object
    // =======================================================
    @Override
    public void Demo3() {
        System.out.println("Child Demo3 method");
    }

    // =======================================================
    // Static methods CANNOT be overridden.
    // This is METHOD HIDING.
    // Binding happens at compile time (Static Binding)
    // =======================================================
    public static void Demo2() {
        System.out.println("Child Demo2 method");
    }

    public static void Demo1() {
        System.out.println("Child Demo1 method");
    }

    public static void main(String[] args) {

        System.out.println("Child Object");

        staticMethod2 s2 = new staticMethod2();
        s2.Demo1();  // Child (method hiding)
        s2.Demo2();  // Child (method hiding)
        s2.Demo3();  // Child (overriding – dynamic binding)

        System.out.println("\nParent Object");

        StaticMethod1 S1 = new StaticMethod1();
        S1.Demo1();  // Parent
        S1.Demo2();  // Parent
        S1.Demo3();  // Parent

        System.out.println("\nUpcasting (Polymorphism check)");
        StaticMethod1 s3 = new staticMethod2();  // Dynamic Binding

        s3.Demo1();  // Parent → static → method hiding (compile-time binding)
        s3.Demo2();  // Parent → static → method hiding
        s3.Demo3();  // Child → overridden → dynamic binding
    }
}
