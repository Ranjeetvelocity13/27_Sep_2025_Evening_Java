package Day_38_25_11_25_ThisSuper_and_EH;

// Parent class
class Parent1 {

    // Parent class constructor
    Parent1() {
        System.out.println("Parent Constructor");
    }
}

public class Program4 extends Parent1 {

    // Child default constructor
    Program4() {
        // If you don't write super(), Java implicitly calls super()
        System.out.println("Child default constructor");
    }

    // Child parameterized constructor
    Program4(int i) {
        super(); // Calls Parent1 constructor explicitly (MUST be the FIRST statement)
        System.out.println("Child parameterized constructor");
    }

    public static void main(String[] args) {

        // Calling child parameterized constructor
        Program4 p4 = new Program4(10);
    }
}
