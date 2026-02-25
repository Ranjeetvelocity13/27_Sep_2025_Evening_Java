package Day_38_25_11_25_ThisSuper_and_EH;

class Demo {

    // Default Constructor
    public Demo() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Demo(int x) {
        // this() → calls the default constructor of SAME class
        this();  
        System.out.println("Parameterized Constructor");
    }
}

public class Program2 {

    public static void main(String[] args) {

        // Creating object using parameterized constructor
        Demo D1 = new Demo(10);
    }
}
