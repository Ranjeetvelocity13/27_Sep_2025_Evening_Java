package Day_45_25_12_04_Collection_Sync_SB;

public class Program_03_StringBufferAndBuilder {

    public static void main(String[] args) {

        // String → Immutable
        // -----------------------------------------
        // - Once created, cannot be changed.
        // - Stored in SCP + Heap.
        // - Any modification creates a NEW object.

        String str = "Test";
        String str1 = new String("Test1");

        // StringBuffer
        // -----------------------------------------
        // - Mutable
        // - Thread-safe (synchronized)
        // - Slower than StringBuilder
        // - Introduced in Java 1.0
        // - Used in multi-threading

        // StringBuilder
        // -----------------------------------------
        // - Mutable
        // - NOT synchronized (not thread-safe)
        // - Faster than StringBuffer
        // - Introduced in Java 1.5
        // - Used in single-threaded applications

        // Default capacity for StringBuffer & StringBuilder = 16 characters

        String str2 = new String("hello");
        System.out.println(str2.length());   // 5

        StringBuffer sb = new StringBuffer("");
        System.out.println(sb.length());     // 0
        System.out.println("Capacity → " + sb.capacity());  // Default 16

        // 1. append() – adds content at the end
        sb.append("World");
        System.out.println(sb);   // World

        // 2. insert() – inserts at specific index
        sb.insert(0, "Java");
        System.out.println(sb);   // JavaWorld

        // 3. replace() – replaces characters from index 2 to 5
        sb.replace(2, 5, "###");
        System.out.println(sb);

        // 4. delete() – deletes characters between index
        sb.delete(2, 5);
        System.out.println(sb);

        // 5. deleteCharAt()
        System.out.println(sb.deleteCharAt(2));

        // 6. reverse()
        System.out.println(sb.reverse());

        // 7. length() and capacity()
        System.out.println("Length → " + sb.length());
        System.out.println("Capacity → " + sb.capacity());

        // ----------------------------------------------------
        // Difference Table
        // ----------------------------------------------------
        // Feature            String          StringBuffer         StringBuilder
        // -----------------------------------------------------------------------
        // Mutability         Immutable       Mutable               Mutable
        // Thread Safe        Yes             Yes (synchronized)    No (faster)
        // Storage            SCP + Heap      Heap                  Heap
        // Default Capacity   N/A             16 characters         16 characters
        // Introduced         Java 1.0        Java 1.0              Java 1.5
        // Speed              Slow            Medium                Fastest
        // Best Use Case      Fixed text      Multi-threading       Single-thread
    }
}
