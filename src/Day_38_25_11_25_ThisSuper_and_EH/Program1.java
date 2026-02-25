package Day_38_25_11_25_ThisSuper_and_EH;

public class Program1 {

    String name;  // Non-static global variable (instance variable)
    int age;      // Non-static global variable (instance variable)

    // Constructor
    public Program1(String name, int age) {

        // 'this' keyword refers to the CURRENT object
        // Used to differentiate between global variables and local variables
        this.name = name;  // assigning local 'name' to global 'name'
        this.age = age;    // assigning local 'age' to global 'age'
    }

    public void Display(String name) {

        // 'name' here is method's local parameter (local variable)
        System.out.println("Local Name: " + name);          // prints value received from Display() argument

        // this.name → refers to object’s instance variable
        System.out.println("Global Name: " + this.name);    // prints global name stored during object creation

        // accessing global variable 'age' using 'this'
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        // Creating object using constructor
        Program1 p1 = new Program1("Rohan", 25);

        // Calling Display method with local name
        p1.Display("Rahul");  
    }
}
