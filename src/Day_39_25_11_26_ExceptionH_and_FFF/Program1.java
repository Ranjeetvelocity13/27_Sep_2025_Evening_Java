package Day_39_25_11_26_ExceptionH_and_FFF;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program1 {

    public static void main(String[] args) throws InterruptedException {

        // -----------------------------
        // Example 1: FileNotFoundException (Checked Exception)
        // -----------------------------
        try {
            FileReader fr = new FileReader("abc.txt");  // File does not exist
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();   // Prints full JVM error stack trace
        }

        // -----------------------------
        // Example 2: NumberFormatException (Unchecked Exception)
        // -----------------------------
        try {
            int n = Integer.parseInt("abc");  // Cannot convert a string to number
        } 
        catch (Exception e) {
            System.out.println("Invalid number format");
        }

        System.out.println("Start");

        // -----------------------------
        // Thread.sleep() → Checked Exception
        // Must use throws OR try/catch
        // -----------------------------
        Thread.sleep(4000);

        // -----------------------------
        // System.exit(0)
        // -----------------------------
        // Stops JVM immediately
        // No code or finally block will execute after this point
        System.exit(0);

        // This will never be executed
        System.out.println("End");
    }
}
