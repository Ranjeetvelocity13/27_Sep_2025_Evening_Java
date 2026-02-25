package Day_15_25_10_16_LoopingStatement;

public class Example2 {

    public static void main(String[] args) {

        /*
         * 🔹 Switch Statement in Java
         * ---------------------------
         * The switch statement allows you to execute one block of code 
         * among many options based on the value of a variable.
         *
         * It works with data types:
         * - int
         * - char
         * - String
         *
         * Syntax:
         * switch (variable) {
         *     case value1:
         *         // code block
         *         break;
         *     case value2:
         *         // code block
         *         break;
         *     case value3:
         *         // code block
         *         break;
         *     default:
         *         // default code block (optional)
         * }
         */

        // Example 1 — Day of the Week
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println("--------------------------");

        // Example 2 — Traffic Signal
        String signal = "Red";

        switch (signal) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }

        System.out.println("--------------------------");

        // Example 3 — Order Status
        String status = "Shipped";

        switch (status) {
            case "New":
                System.out.println("Order Received");
                break;
            case "Shipped":
                System.out.println("Order On The Way");
                break;
            case "Delivered":
                System.out.println("Order Delivered");
                break;
            case "Canceled":
                System.out.println("Order Canceled");
                break;
            default:
                System.out.println("Unknown Status");
        }

        System.out.println("--------------------------");
        System.out.println("Program executed successfully!");
        
        
    }
    
    
}
