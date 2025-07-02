package day12_Arrays_Strings_DSA;

// Given a 2D array, find and print the maximum number in it.

public class MatrixMaxElement_1 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 5, 7,}, {9, 11, 20}};

        int max = matrix[0][0];   // Assume first element is max

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element = " + max);
    }
}
