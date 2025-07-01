package day12_Arrays_Strings_DSA;

public class MatrixExample_2 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30}, {40, 45, 50}, {55, 60, 65}};

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
