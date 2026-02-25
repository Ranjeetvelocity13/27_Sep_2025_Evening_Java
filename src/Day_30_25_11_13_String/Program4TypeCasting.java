package Day_30_25_11_13_String;

public class Program4TypeCasting {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // TYPE CASTING IN JAVA
        // ---------------------------------------------------------

        /*
         * Type casting in Java is the process of converting one data type into another.
         *
         * There are 2 types:
         *
         * 1. Automatic Type Casting (Widening)
         *    - Happens automatically
         *    - Smaller data type → Larger data type
         *    - No data loss
         *    - Also called Implicit Casting or Upcasting
         *
         *    byte → short → int → long → float → double
         *
         *    Syntax:
         *       largeTypeVariable = smallTypeVariable;
         *
         * 2. Explicit Type Casting (Narrowing)
         *    - Done manually
         *    - Larger data type → Smaller data type
         *    - Possible data loss
         *    - Also called Downcasting
         *
         *    double → float → long → int → short → byte
         *
         *    Syntax:
         *       smallTypeVariable = (smallType) largeTypeValue;
         */

        // ---------------------------------------------------------
        // AUTOMATIC TYPE CASTING (WIDENING)
        // ---------------------------------------------------------

        int a = 10;
        double b = a;     // int → double (automatic)
        System.out.println(b);  // 10.0

        byte x = 50;
        int y = x;        // byte → int (automatic)
        System.out.println(y);  // 50


        // ---------------------------------------------------------
        // EXPLICIT TYPE CASTING (NARROWING)
        // ---------------------------------------------------------

        double d = 10.50;
        int i = (int) d;  // double → int (manual)
        System.out.println(i);  // 10 (decimal part lost)

        int num = 130;
        byte b1 = (byte) num;  
        System.out.println(b1);
        // Explanation:
        // byte range = -128 to 127
        // 130 is out of range → overflow happens → prints -126


        // ---------------------------------------------------------
        // CHAR TO INT (ASCII CONVERSION)
        // ---------------------------------------------------------

        char c = 'B';
        int asciiValue = c;   // automatic widening
        System.out.println(asciiValue);  // 66


        // ---------------------------------------------------------
        // STRING TO INT (Using Wrapper Class)
        // ---------------------------------------------------------

        String S1 = "100";
        System.out.println(S1 + 10);  // 10010 (String concatenation)

        int num1 = Integer.parseInt(S1);  // String → int
        System.out.println(num1 + 10);    // 110 (addition)


        // ---------------------------------------------------------
        // INT TO STRING
        // ---------------------------------------------------------

        int x1 = 50;
        System.out.println(x1 + 20);  // 70 (addition)

        String str2 = String.valueOf(x1);   // int → String
        System.out.println(str2 + 20);      // 5020 (String concatenation)
    }
}
