package Day_11_25_19_10_Operators;

public class Assignment {

    public static void main(String[] args) {

    	
    
        /*
         * Assignment Operators in Java
         * -----------------------------
         * Used to assign values to variables.
         *
         *  =   →  Simple assignment
         *  +=  →  Add and assign (a += 2 → a = a + 2)
         *  -=  →  Subtract and assign (a -= 2 → a = a - 2)
         *  *=  →  Multiply and assign (a *= 2 → a = a * 2)
         *  /=  →  Divide and assign (a /= 2 → a = a / 2)
         *  %=  →  Modulus and assign (a %= 2 → a = a % 2)
         */
        int a = 10;

        System.out.println("Initial value of a: " + a);

        a += 5;   // a = 10 + 5
        System.out.println("a += 5  → " + a);

        a -= 3;   // a = 15 - 3
        System.out.println("a -= 3  → " + a);

        a *= 3;   // a = 12 * 3
        System.out.println("a *= 3  → " + a);

        a /= 3;   // a = 36 / 3
        System.out.println("a /= 3  → " + a);

        a %= 34;   // a = 12 % 34
        System.out.println("a %= 34  → " + a);
        
    }
}
