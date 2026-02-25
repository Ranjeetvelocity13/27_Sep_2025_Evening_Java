package Day_46_25_12_05_Wrapper_Singletone;

public class Program_02_SingleTone {

    // Step 1: Create a static instance of the class (initially null)
    private static Program_02_SingleTone singleton_instance = null;

    public String str;

    // Step 2: Make the constructor private (so no one can create object using 'new')
    private Program_02_SingleTone() {
        str = "Java Selenium";
    }

    // Step 3: Create a public static method to return the same instance
    public static Program_02_SingleTone getInstance() {

        if (singleton_instance == null) {
            singleton_instance = new Program_02_SingleTone();  // Object created only once
        }
        return singleton_instance; // Always returns the same object
    }

    public static void main(String[] args) {

        // A Singleton class allows ONLY ONE object to be created during the entire program.

        // WHY Singleton is used?
        // 1. To avoid creating multiple unnecessary objects
        // 2. To save memory
        // 3. To maintain a single shared instance across the application
        // Examples:
        //  WebDriver driver = new ChromeDriver();   --> Should be one object only
        //  Logger utility
        //  Database connection
        //  Configuration reader

        // Getting the same instance using getInstance()
        Program_02_SingleTone x = Program_02_SingleTone.getInstance();
        Program_02_SingleTone y = Program_02_SingleTone.getInstance();
        Program_02_SingleTone z = Program_02_SingleTone.getInstance();

        // Modifying value using x
        x.str = x.str.toUpperCase();

        System.out.println(x.str);
        System.out.println(y.str); // SAME object → SAME value
        System.out.println(z.str);

        // Modify using z
        z.str = z.str.toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        // File Handling, Enum class, JVM, JDK, JRE can be taught next
    }
}
