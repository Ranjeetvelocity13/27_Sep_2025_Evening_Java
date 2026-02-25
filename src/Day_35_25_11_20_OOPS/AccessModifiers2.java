package Day_35_25_11_20_OOPS;

public class AccessModifiers2 extends Accessmodfiers1 {

    public static void main(String[] args) {

        // ================================================
        // Rule 1: While overriding a method, 
        // you CANNOT reduce the visibility of the method.
        //
        // Allowed (increasing visibility):
        //    private   → cannot be overridden (not visible)
        //    default   → protected / public
        //    protected → public
        //
        // Not Allowed (reducing visibility):
        //    public → protected / default / private   (❌)
        //    protected → default / private           (❌)
        //    default → private                      (❌)
        //
        // Example:
        // If parent method is protected → child can make it public ✔
        // If parent method is public   → child CANNOT make it protected ✘
        // ================================================
    }

    // ❌ Example of reducing visibility (NOT allowed)
    /*
    private void Test1() {
        System.out.println("This is not allowed if parent method is public/protected/default");
    }
    */

    // ✔ Example: Increasing visibility (allowed)
    @Override
    public void Test3() {
        System.out.println("public method overriding a protected method");
    }

}
