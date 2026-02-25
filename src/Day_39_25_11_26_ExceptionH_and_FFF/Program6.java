package Day_39_25_11_26_ExceptionH_and_FFF;

// Parent class
class Parent {

    // final method → cannot be overridden in child classes
    public final void Displayed() {
        System.out.println("Parent");
    }
}

public class Program6 extends Parent { 
    // If Parent class was declared final → this class would not be allowed to extend it
    // Example: final class Parent { }  → Cannot be inherited

    /*
    //  INVALID: Cannot override a final method
    @Override
    public void Displayed() {
        System.out.println("Child");
    }
    */

    public static void main(String[] args) {

        // FINAL KEYWORD → used to restrict modification

        // 1️⃣ FINAL VARIABLE
        final int x = 20;
        // x = 30;  //  Error: Cannot change value of a final variable

        System.out.println(x);

        // 2️⃣ FINAL METHOD (Already shown above)
        // - Cannot be overridden in child class

        // 3️⃣ FINAL CLASS
        // - Cannot be extended/inherited
        // Example:
        // final class Demo { }
        // class ABC extends Demo { }  //  Not allowed
    }
}
