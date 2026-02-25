package Day_39_25_11_26_ExceptionH_and_FFF;

public class Program3 {

    public static void main(String[] args) {

        // throw keyword → used to manually throw an exception
        Program3.checkAge(19);  // Valid age
        Program3.checkAge(17);  // Throws exception
    }

    public static void checkAge(int age) {

        if (age < 18) {
            // Manually throwing an exception
            // Better to throw ArithmeticException or IllegalArgumentException
            throw new IllegalArgumentException("Age must be 18+");
        }

        System.out.println("Access Granted");
    }
}
