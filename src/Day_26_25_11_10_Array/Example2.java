package Day_26_25_11_10_Array;

public class Example2 {

    public static void main(String[] args) {

        // 1. Declaration + Creation + Initialization
        // A 2D array with 4 rows and 3 columns
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        // 2. Print total rows and columns
        System.out.println("Rows: " + arr.length);          // Total rows = 4
        System.out.println("Columns: " + arr[0].length);    // Total columns = 3
        System.out.println("------------------------------");

        // 3. Access a specific element
        System.out.println("Element at [2][1]: " + arr[2][1]); // prints 8
        System.out.println("------------------------------");

        // 4. Print all elements using nested loops
        System.out.println("Matrix Elements:");
        for (int row = 0; row < arr.length; row++) {             // Outer loop for rows
            for (int col = 0; col < arr[row].length; col++) {    // Inner loop for columns
                System.out.print(arr[row][col] + "\t");          // \t for spacing
            }
            System.out.println(); // New line after each row
        }

        System.out.println("------------------------------");

        // 5. Calculate the sum of all elements
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
