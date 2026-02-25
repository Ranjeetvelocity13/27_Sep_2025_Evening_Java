package Day_19_25_10_30_Loop;

public class Example9 {

    // Instance variables (each object will have its own copy)
    String studentName;
    int age;

    // Method to set values for variables
    public void setData(String name, int a) {
        studentName = name;
        age = a;
    }

    // Method to display student data
    public void showData() {
        System.out.println("Name: " + studentName + "  Age: " + age);
    }

    public static void main(String[] args) {

        /*
         * Example 5: Working with Multiple Objects
         * ----------------------------------------
         * Each object of a class holds its own data.
         *
         * Steps:
         * 1. Create objects of the Example5 class
         * 2. Set values for each object using setData()
         * 3. Display values using showData()
         */

        Example9 E5 = new Example9();  // Object 1
        Example9 E6 = new Example9();  // Object 2

        // Assign data to each object
        E5.setData("Rohit", 20);
        E6.setData("Vikas", 25);

        // Display data from each object
        E5.showData();
        E6.showData();
    }
}
