package day12_Arrays_Strings_DSA;

// Given a 2D array, find and print the maximum number in it.

public class MatrixMaxElement_3 {
    public static void main(String[] args) {
        int[][] matrix = {{89, 78, 45, 67}, {45, 12, 46, 86}, {90, 56, 91, 68}};

        int max = matrix[0][0];     // Assume first element is max

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element is : " + max);
    }
}
