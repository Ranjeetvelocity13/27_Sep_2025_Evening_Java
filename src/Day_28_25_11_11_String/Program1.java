package Day_28_25_11_11_String;

public class Program1 {

    public static void main(String[] args) {

        // Create object to call non-static method
        Program1 p1 = new Program1();
        p1.Demo1(); // Calling method

        // ----------------------------
        // 1. Using String Literal
        // ----------------------------

        String name1 = "Velocity";  
        String name2 = "Velocity";  

        // Stored in String Constant Pool (SCP)
        // Java reuses the same literal reference to save memory.
        // name1 and name2 both point to the same SCP object.

        System.out.println("name1 == name2 : " + (name1 == name2));       // true
        System.out.println("name1.equals(name2) : " + name1.equals(name2)); // true

        // ----------------------------
        // 2. Using new Keyword
        // ----------------------------

        String name3 = new String("Velocity");
        String name4 = new String("Velocity");

        // Stored in Heap Memory
        // Each new keyword creates a new String object,
        // even if the value is the same.

        System.out.println("name3 == name4 : " + (name3 == name4));       // false (different heap objects)
        System.out.println("name3.equals(name4) : " + name3.equals(name4)); // true (same content)

        // ----------------------------
        // Print String values
        // ----------------------------
        
        System.out.println("name1: " + name1);
        System.out.println("name3: " + name3);
    }

    // ------------------------------------
    // Example of String creation (Heap + SCP)
    // ------------------------------------
    public void Demo1() {

        String S1 = "Test";                    // SCP
        String S2 = "Test";                    // SCP (reused from S1)
        String S3 = new String("Python");      // Heap + SCP reference
        String S4 = new String("Test");        // New object in Heap
        String S5 = new String("Automation");  // Heap + SCP reference

        // Print reference comparison
        System.out.println("----------------------------");
        System.out.println("S1 == S2 : " + (S1 == S2));   // true → both point to same SCP object
        System.out.println("S1 == S4 : " + (S1 == S4));   // false → S4 in heap
        System.out.println("S1.equals(S4) : " + S1.equals(S4)); // true → same content
        System.out.println("S3 == S5 : " + (S3 == S5));   // false → both separate heap objects
        System.out.println("----------------------------");
    }
}
