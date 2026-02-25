package Day_28_25_11_11_String;

public class Program3 {

    public static void main(String[] args) {

        // ==============================================
        // 1️⃣ Example: String Immutability in Java
        // ==============================================

        /*
         * Immutable means "cannot be changed".
         * Once a String object is created in Java, its value cannot be modified.
         * Any operation that appears to modify a string actually creates a new String object.
         */

        String name = "Java"; // Stored in SCP (String Constant Pool)

        System.out.println("Before modification: " + name);

        // concat() returns a new String object, but we’re not assigning it
        name.concat(" Programming");
        System.out.println("After concat() without assignment: " + name); // Still prints "Java"

        // Now we assign the concatenated value back to the variable
        name = name.concat(" Programming");
        System.out.println("After concat() with assignment: " + name); // "Java Programming"

        System.out.println("---------------------------------------------");

        // ==============================================
        // 2️⃣ Extra Example: Reverse a String
        // ==============================================

        String str = "Automation";
        System.out.println("Original String: " + str);

        int len = str.length(); // find length
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
