package day12_Arrays_Strings_DSA;


// Given a 2D array, find and print the maximum number in it.

public class MatrixMaxElement_2 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {29, 58, 67}, {89, 67,78}};

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
