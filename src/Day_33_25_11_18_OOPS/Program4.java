package Day_33_25_11_18_OOPS;

public class Program4 {

    public static void main(String[] args) {

        Program4 p4 = new Program4();

        // Calling non-static overloaded method (object required)
        p4.addition(10, 20);  
        // Output: Addition of two int number --> 30

        // Calling static overloaded methods (no object required)
        Program4.addition(10, "Test");  
        // Output: 10Test

        Program4.addition(10, 10, "Test");  
        // Output: 20Test
    }

    // 1. Overloaded method: two int parameters (NON-STATIC)
    public void addition(int i, int j) {
        int add = i + j;
        System.out.println("Addition of two int number  --> " + add);
    }

    // 2. Overloaded method: int + String (STATIC)
    public static void addition(int i, String s) {
        // Number + String = concatenation
        System.out.println(i + s);
    }

    // 3. Overloaded method: int + int + String (STATIC)
    public static void addition(int i, int j, String k) {
        // (i + j) is evaluated first → int addition
        // then concatenated with String
        System.out.println((i + j) + k);
    }
}
