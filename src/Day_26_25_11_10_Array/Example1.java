package Day_26_25_11_10_Array;

public class Example1 {

    public static void main(String[] args) {

        // 1. Declaration
        // Only declaring the array reference here, no memory allocated yet.
        int[][] matrix;

        // 2. Creation
        // Now we are creating memory for 4 rows and 4 columns.
        matrix = new int[4][4];

        // 3. Declaration + Creation together
        // Both steps done in one line.
        int[][] mar = new int[4][4];

        // 4. Example with String data type (4x4 matrix)
        String[][] str = new String[4][4];

        // 5. Display total rows and columns
        System.out.println("Rows: " + str.length);         // Total rows = 4
        System.out.println("Columns: " + str[0].length);   // Total columns = 4
        System.out.println("----------------------------");

        // 6. Initialization (Assigning values to each cell)
        // Row A
        str[0][0] = "A1";
        str[0][1] = "A2";
        str[0][2] = "A3";
        str[0][3] = "A4";

        // Row B
        str[1][0] = "B1";
        str[1][1] = "B2";
        str[1][2] = "B3";
        str[1][3] = "B4";

        // Row C
        str[2][0] = "C1";
        str[2][1] = "C2";
        str[2][2] = "C3";
        str[2][3] = "C4";

        // Row D
        str[3][0] = "D1";
        str[3][1] = "D2";
        str[3][2] = "D3";
        str[3][3] = "D4";

        // 7. Access specific elements by index
        System.out.println("Element [2][3]: " + str[2][3]); // prints C4
        System.out.println("Element [3][3]: " + str[3][3]); // prints D4
        System.out.println("----------------------------");

        // 8. Traversing the 2D Array using nested loops
        // Outer loop → Rows
        // Inner loop → Columns
        System.out.println("Matrix Elements:");
        for (int row = 0; row < str.length; row++) { // iterating over rows
            for (int col = 0; col < str[row].length; col++) { // iterating over columns
                System.out.print(str[row][col] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
