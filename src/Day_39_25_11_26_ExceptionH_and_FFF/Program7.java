package Day_39_25_11_26_ExceptionH_and_FFF;

public class Program7 {

    public static void main(String[] args) {

        // finally → A block of code that ALWAYS executes
        // It runs whether an exception occurs or not.
        getValue();
    }

    public static void getValue() {

        try {
            System.out.println("Hello");
        }
        finally {
            // finally block ALWAYS executes
            System.out.println("Finally block executed");
        }
    }
}
