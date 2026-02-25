package Day_07_25_10_06_Method;  // Package name

// Class definition
public class Method3 {

    // Main method — program execution starts here
    public static void main(String[] args) {

        System.out.println("Program started");
        
        //️ Direct method calling - (same class methods can be called directly)
        System.out.println("Calling by methodName");
        
        javaDevelopment();     // Direct call to static method
        AutomationTesting();   // Direct call to static method
        manualTesting();       // Direct call to static method
        
        // Calling by ClassName.methodName - another valid way to call static methods
        System.out.println();
        System.out.println("*********************");
        System.out.println("Calling by ClassName.methodName");
        
        Method3.AutomationTesting();   // Called using class name
        Method3.javaDevelopment();     // Called using class name
        Method3.manualTesting();       // Called using class name
        
        System.out.println("Program ended");
    }
    
    
    // Static method 1 — Automation Testing types
    public static void AutomationTesting() {
        System.out.println("UI Automation testing");
        System.out.println("API Automation testing");
        System.out.println("Database Automation testing");
        System.out.println("Mobile Automation testing");
    }
    
    // Static method 2 — Java Development
    public static void javaDevelopment() {
        System.out.println("Web Java Development");
    }
    
    // Static method 3 — Manual Testing
    public static void manualTesting() {
        System.out.println("Manual Testing");
    }
}
