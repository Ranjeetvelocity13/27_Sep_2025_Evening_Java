package Day_46_25_12_05_Wrapper_Singletone;

import java.util.ArrayList;

public class Program_01_WrapperClass {

    public static void main(String[] args) {

        // Wrapper classes are object representations of primitive data types.
        // They allow primitives to be used in Collections, Generics, and provide utility methods.

        /*
         * Java has 8 Primitive Data Types and their Wrapper Classes:
         *
         * Primitive       Wrapper Class
         * --------------------------------
         * byte           → Byte
         * short          → Short
         * int            → Integer
         * long           → Long
         * float          → Float
         * double         → Double
         * char           → Character
         * boolean        → Boolean
         *
         * Why do we need Wrapper Classes?
         * 1. Java Collections (ArrayList, HashMap, etc.) cannot store primitive types.
         * 2. For converting between String ↔ Number. (parseInt, parseDouble, etc.)
         * 3. Wrapper classes provide useful utility methods.
         * 4. Autoboxing and Unboxing make coding easier.
         */


        // ===========================================
        // AUTOBOXING — primitive → Wrapper object
        // ===========================================
        int a = 10;                // primitive
        Integer obj = a;           // autoboxing

        System.out.println("Autoboxing (int → Integer): " + obj);


        // ===========================================
        // UNBOXING — Wrapper object → primitive
        // ===========================================
        Integer x = 20;
        int y = x;                 // unboxing

        System.out.println("Unboxing (Integer → int): " + y);


        // ===========================================
        // String → int (parseInt)
        // ===========================================
        String price = "250";
        int value = Integer.parseInt(price);   // converts String to int

        System.out.println("After parsing: " + (value + 50)); // 300


        // ===========================================
        // int → String (valueOf)
        // ===========================================
        int age = 30;
        String strAge = String.valueOf(age);   // int converted to String

        System.out.println("int to String: " + strAge + 5);  // concatenation: "305"


        // ===========================================
        // CHARACTER utility methods
        // ===========================================
        char c = '5';
        System.out.println("Is digit? " + Character.isDigit(c));          // true
        System.out.println("Is letter? " + Character.isLetter(c));        // false
        System.out.println("Is whitespace? " + Character.isWhitespace(' ')); // true


        // ===========================================
        // Wrapper classes inside Collections (Autoboxing happens)
        // ===========================================
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80); // autoboxing (int → Integer)
        marks.add(40);

        System.out.println("Marks: " + marks);


        /*
         * parseInt() vs valueOf()
         *
         * Integer.parseInt("100")  → returns primitive int (100)
         * Integer.valueOf("100")   → returns Integer object (100)
         *
         * Use parseInt() when doing calculations.
         * Use valueOf() when working with Collections or Wrapper objects.
         */

    }
}
