package Day_26_25_11_10_Array;

public class Example3 {

    public static void main(String[] args) {

        // 1. Declaration + Initialization of 2D array
        // 3 rows × 3 columns matrix
        int[][] matrix = {
            {10, 25, 30},
            {5, 45, 20},
            {60, 15, 35}
        };

        // 2. Assume first element as both max and min
        int max = matrix[0][0]; // starting value = 10
        int min = matrix[0][0]; // starting value = 10

        // 3. Enhanced for loop to iterate through all elements
        for (int[] row : matrix) {           // outer loop for each row
            for (int val : row) {            // inner loop for each value
                if (val > max) max = val;    // if current value is greater than max
                if (val < min) min = val;    // if current value is smaller than min
            }
        }

        // 4. Display maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
