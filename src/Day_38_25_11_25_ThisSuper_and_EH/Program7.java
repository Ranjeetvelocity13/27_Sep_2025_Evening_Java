package Day_38_25_11_25_ThisSuper_and_EH;

public class Program7 {

    public static void main(String[] args) {

        System.out.println("Program started");

        // Multiple catch blocks example
        try {

            int arr[] = { 1, 2, 3 };  
            // Accessing invalid index → throws ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);  

        }

        // This catch block will NOT execute because the exception is NOT ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }

        // This catch block will NOT execute because the exception is NOT StringIndexOutOfBoundsException
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index error");
        }

        // Since the actual exception is ArrayIndexOutOfBoundsException
        // and no specific catch block for it exists above,
        // this generic Exception catch block will execute.
        catch (Exception e) {
            System.out.println("Generic exception (Handled by Exception class)");
        }

        System.out.println("Program ended");
    }
}
