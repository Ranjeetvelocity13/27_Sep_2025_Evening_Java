package Day_28_25_11_11_String;

public class Program2 {

    public static void main(String[] args) {

        // ================================
        // 1️⃣ Difference between == Operator and .equals() Method
        // ================================

        // Using 'new' keyword → Stored in Heap Memory (HM)
        String s1 = new String("Java");   // Heap
        String s2 = new String("Java");   // Heap
        String s3 = new String("Java");   // Heap

        // == checks if both references point to the same memory location
        System.out.println("s1 == s2 : " + (s1 == s2)); // false → different heap objects

        // .equals() checks if both strings have the same value (content)
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true → same content

        System.out.println("------------------------------------");

        // Using String Literal → Stored in String Constant Pool (SCP)
        String a = "Python";  // SCP
        String b = "Python";  // SCP (reused, same reference)
        String c = new String("Python"); // Heap (new object)

        System.out.println("a == b : " + (a == b)); // true → both point to same SCP object
        System.out.println("a == c : " + (a == c)); // false → different memory (SCP vs Heap)
        System.out.println("a.equals(b) : " + a.equals(b)); // true → same content
        System.out.println("a.equals(c) : " + a.equals(c)); // true → same content

        System.out.println("------------------------------------");

        // Summary comments:
        // ==      → Reference comparison (memory address)
        // .equals → Content comparison (actual value)
        //
        // Reference comparison:
        // If both variables refer to the same object in memory → returns true.
        //
        // Content comparison:
        // If all characters inside both strings match → returns true.
    }
}
