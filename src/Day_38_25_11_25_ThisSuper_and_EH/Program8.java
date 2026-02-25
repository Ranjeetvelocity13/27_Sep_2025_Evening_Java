package Day_38_25_11_25_ThisSuper_and_EH;

public class Program8 {

    public static void main(String[] args) {

        // finally block → ALWAYS executes (exception OR no exception)
        System.out.println("----- Example 1: Arithmetic Exception -----");

        try {
            System.out.println(10 / 0);  // Exception occurs here (ArithmeticException)
        }
        catch (Exception e) {
            System.out.println("Error occurred: Cannot divide by zero");
        }
        finally {
            System.out.println("Finally Block: Always runs (Cleanup)");
        }

        System.out.println("\n----- Example 2: NullPointerException -----");

        try {
            String s = null;  
            System.out.println(s.length());  // NullPointerException
        }
        catch (Exception e) {
            System.out.println("Error: Object is null");
        }
        finally {
            System.out.println("Finally Block: Always runs after try/catch");
        }

        System.out.println("\nProgram Ended.");
    }
}
