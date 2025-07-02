package day12_Arrays_Strings_DSA;

public class TransposeMatrix_2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 7, 89, 23}, {12, 45, 68, 21}, {67, 89, 23, 56}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];   // notice rows and cols are swapped

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Printing the Transpose matrix
        System.out.println("Transpose of Matrix : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
