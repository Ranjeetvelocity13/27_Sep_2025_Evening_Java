package Day_38_25_11_25_ThisSuper_and_EH;

// Parent class
class Parent {

    String name = "Parent Name";   // Parent class variable
}

// Child class
public class Program3 extends Parent {

    String name = "Child Name";    // Child class variable (same variable name)

    public void show() {

        // Accessing child class variable
        System.out.println(name);        // Child Name

        // Accessing parent class variable using super keyword
        System.out.println(super.name);  // Parent Name
    }

    public static void main(String[] args) {

        Program3 p3 = new Program3();
        p3.show();
    }
}
