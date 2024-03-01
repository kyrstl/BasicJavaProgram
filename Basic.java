public class Basic {

    // Method to calculate the median of an array
    public static double findMedian(int[] array) {
        int length = array.length;
        // Sort the array
        java.util.Arrays.sort(array);
        // Check if length of array is even or odd
        if (length % 2 == 0) {
            // If even, calculate the average of the two middle elements
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            // If odd, return the middle element
            return array[length / 2];
        }
    }

    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int r1 = firstMatrix.length;
        int c1 = firstMatrix[0].length;
        int c2 = secondMatrix[0].length;

        // Resultant matrix
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test the median method
        int[] numArray = { 12, 3, 5, 7, 4, 19, 26 };
        System.out.println("Median: " + findMedian(numArray));

        // Test the matrix multiplication method
        int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
        int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix);
        
        System.out.println("Product of matrices:");
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
