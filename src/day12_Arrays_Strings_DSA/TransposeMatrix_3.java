package day12_Arrays_Strings_DSA;

public class TransposeMatrix_3 {
    public static void main(String[] args) {
        int[][] matrix = {{4, 4, 4}, {5, 5, 5}, {6, 6, 6}, {7, 7, 7}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];   // rows and cols swapped

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // printing transpose matrix
        System.out.println("Transpose of Matrix: ");
        for (int i = 0; i < cols; i++) {
            for (int j= 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
