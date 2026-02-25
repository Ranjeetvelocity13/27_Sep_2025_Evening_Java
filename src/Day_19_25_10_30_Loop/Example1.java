package Day_19_25_10_30_Loop;

public class Example1 {

    public static void main(String[] args) {

        /*
         *  Example 1: do-while Loop
         * ----------------------------
         * The do-while loop executes the code block first,
         * and then checks the condition.
         *
         *  Key Difference from while:
         * The body of a do-while loop executes **at least once**
         * even if the condition is false at the start.
         *
         *  Syntax:
         * do {
         *     // code to be executed
         * } while (condition);
         */

        //️⃣ Print numbers from 1 to 5
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5); // condition checked after loop body

        System.out.println(); // line break

        // 2️⃣ Print even numbers from 2 to 10
        int n = 2;
        do {
            System.out.print(n + " ");
            n += 2; // increment by 2 to get even numbers
        } while (n <= 10);

        System.out.println(); // line break

        // 3️⃣ Print reverse numbers from 10 to 1
        int num = 10;
        do {
            System.out.print(num + " ");
            num--;
        } while (num >= 1);

        System.out.println();
        System.out.println("Program executed successfully ");
    }
}
