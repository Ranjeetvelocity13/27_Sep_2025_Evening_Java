package Day_22_25_11_04_Constructor;

public class Example2 {

	//Constructor name must be exactly the same as the class name.
	
//	public example2() { //incorrect
//		
//		
//	}
	
	public Example2() {
		
		System.out.println("Rule one");
	}
	
	public static void main(String[] args) {
		

		Example2 e2 = new Example2();
		Example2 e3 = new Example2();

	}

}

/*
Constructor 
A constructor in Java is a special method used to initialize objects. It is called when an instance (object) of a class is created.Constructors has the same name as the class and does not have a return type, not even void. 
Every time an object is created using the new() keyword, at least one constructor is
called.

If there is no constructor available in the class. In such case, Java compiler provides a default constructor.

Rules for creating Java constructor

Constructor name must be exactly the same as the class name.
Constructors cannot be declared inside methods or other constructors. They must be declared directly in the class body.
Constructors must not specify a return type (not even void). If you put a return type it becomes a regular method, not a constructor.
Only access modifiers are applicable: public, protected, private, or package-private (no modifier). Not allowed: static, final, abstract, native (these modifiers cannot be applied to constructors).
You may declare more than one constructor (overload constructors) in a class. Overloaded constructors must have different parameter lists.



 Types of Constructor
1. Default Constructor
2..Userdefine Constructor

1.Default Constructor 
Definition
If a constructor is not declared in a Java class, then the compiler automatically provides one at the time of compilation.
This compiler-provided constructor is called the Default Constructor.

Rules of the Default Constructor
It is always a zero-argument (no-parameter) constructor.
The access modifier of the default constructor is the same as the class.
The default constructor contains one implicit statement — a call to super(), which invokes the parent class constructor.
It initializes the object with default values (0, null, false, etc.).
The default constructor is only provided if no other constructor is declared by the programmer.

2. Userdefined Constructor
 If programmer is declaring constructor in java class then it is considered to be as User
defined constructor.

User defined/Parameterized Constructor are classified into 2 types
1. Without/zero parameter constructor
2. With parameter constructor



*/
