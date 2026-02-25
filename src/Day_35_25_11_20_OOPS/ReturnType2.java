package Day_35_25_11_20_OOPS;

public class ReturnType2 extends ReturnType1 {

    // ===========================================================
    // Covariant Return Types:
    // When overriding, child class can return a more specific type
    // (only applicable for NON-primitive return types).
    // ===========================================================

    // Allowed: String is subclass of Object → Covariant return
    @Override
    public String Demo1() {
        System.out.println("Child Demo1 method (String return)");
        return "Child value";
    }
    // ❌ Not allowed: Cannot reduce return type
    // Parent returns String → Child cannot return Object
    /*
    @Override
    public Object Demo2() {
        System.out.println("Not allowed: Object return when parent returns String");
        return null;
    }
    */
    
    // ❌ Primitive return types must match exactly.
    // int → cannot be changed to long (even though long is bigger)
    /*
    @Override
    public long Demo3() {
        return 100;
    }
    */
    public static void main(String[] args) {

    }
}
