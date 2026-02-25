package Day_11_25_19_10_Operators;

public class Operator {

    /*
     * An operator in Java is a symbol that performs a specific operation
     * on one, two, or more operands (values or variables) and returns a result.
     * 
     * Types of Operators:
     * 1. Arithmetic Operator
     * 2. Unary Operator
     * 3. Relational (Comparison) Operator
     * 4. Logical Operator
     * 5. Assignment Operator
     * 6. Conditional / Ternary Operator
     * 7. Bitwise Operator
     */
    
    public static void main(String[] args) {
        
        int a = 10, b = 2;
        
        int c = a + b; // '+' is the operator; 'a' and 'b' are operands.
        
        System.out.println("Addition: " + (a + b));
        
        // 1. Arithmetic Operators
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
