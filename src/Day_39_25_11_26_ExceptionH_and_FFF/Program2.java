package Day_39_25_11_26_ExceptionH_and_FFF;

import java.io.FileInputStream;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) {

        // ------------------------------------------
        // 1️⃣ CHECKED EXCEPTION: FileNotFoundException / IOException
        // ------------------------------------------
        try {
            FileInputStream fis = new FileInputStream("xyz.txt");  // File does not exist
        } 
        catch (IOException e) {
            System.out.println("File not found or cannot be opened");
            e.printStackTrace();
        }

        // ------------------------------------------
        // 2️⃣ UNCHECKED EXCEPTION: ClassCastException
        // ------------------------------------------
        try {
            Object obj = new Integer(10);  // Parent reference → Child object
            String str = (String) obj;     // ❌ Invalid downcasting
        }
        catch (ClassCastException e) {
            System.out.println("Invalid Type Casting (ClassCastException)");
        }

        // ------------------------------------------
        // 3️⃣ Nested try-catch example
        // ------------------------------------------
        try {

            // Inner try block
            try {
                Thread.sleep(1000);  // Checked exception
            } 
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

        } 
        catch (IllegalArgumentException e) {
            System.out.println("Illegal argument provided");
        }

    }
}
