package Day_39_25_11_26_ExceptionH_and_FFF;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program4 {

    public static void main(String[] args) throws FileNotFoundException {

        // throws → used in method signature to declare that a method may throw an exception
        // This tells the caller: "I am not handling the exception, you handle it."

        // FileReader constructor throws FileNotFoundException (Checked Exception)
        FileReader fio = new FileReader(
                "../27_Sep_2025_Evening_Java/src/Day_39_25_11_26_ExceptionHandling/abc.txt");

        System.out.println("Hello");

        /*
         * WHEN TO USE throws?
         * -------------------
         * 1. When you don't want to handle the exception in the current method.
         * 2. When you want the calling method (or JVM) to handle the exception.
         * 3. Commonly used with methods that call risky operations:
         *      - File handling
         *      - Database handling
         *      - Thread.sleep()
         * 4. Mostly used for CHECKED exceptions.
         * 
         * 
         * try     → Used to wrap risky code
         * catch   → Used to handle exception
         * finally → Always runs (cleanup, closing resources)
         * 
         * throw   → Manually throw an exception
         * throws  → Declares an exception
         * 
         * 
         * finally block ALWAYS runs:
         * ------------------------------------------------
         * Case 1: Exception occurs AND is handled → finally runs
         * Case 2: Exception occurs AND is NOT handled → finally runs
         * Case 3: No exception → finally runs
         * Only exception: System.exit(0) stops finally
         */
    }
}
