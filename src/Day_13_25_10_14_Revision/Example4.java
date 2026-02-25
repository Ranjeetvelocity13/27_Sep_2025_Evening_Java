package Day_13_25_10_14_Revision;

// Example4 - Demonstrates all basic Java operators
public class Example4 {

	public static void main(String[] args) {
		
		// ---------------- Arithmetic Operators ----------------
		int a = 20, b = 7;
		System.out.println("Addition : " + (a + b));       // 27
		System.out.println("Subtraction : " + (a - b));    // 13
		System.out.println("Multiplication : " + (a * b)); // 140
		System.out.println("Division : " + (a / b));       // 2 (integer division)
		System.out.println("Modulus : " + (a % b));        // 6 (remainder)
		
		System.out.println("-----------------------");
		
		
		// ---------------- Relational & Logical Operators ----------------
		int x = 10, y = 20;
		
		// Relational operators return boolean values (true/false)
		System.out.println(x > y);   // false
		System.out.println(x < y);   // true
		
		// Logical AND (&&): true only if both conditions are true
		System.out.println((x < y) && (y > x)); // true && true = true
		System.out.println((x < y) && (y < x)); // true && false = false
		
		System.out.println("-----------------------");
		
		// Logical OR (||): true if any one condition is true
		System.out.println((x < y) || (y > x)); // true || true = true
		System.out.println((x < y) || (y < x)); // true || false = true
		
		System.out.println("-----------------------");
		
		
		// ---------------- Assignment Operators ----------------
		int aa = 10;
		aa += 5;  // same as aa = aa + 5
		System.out.println("After += : " + aa); // 15
		
		System.out.println("-----------------------");
		
		
		// ---------------- Ternary Operator ----------------
		int marks = 75;
		
		// Syntax: condition ? value_if_true : value_if_false
		String result = (marks >= 40) ? "Pass" : "Fail";
		System.out.println("Result : " + result); // Pass
	}
}
