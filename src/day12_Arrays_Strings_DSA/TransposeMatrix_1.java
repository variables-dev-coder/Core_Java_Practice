package day12_Arrays_Strings_DSA;

public class TransposeMatrix_1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 5, 7}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows]; // notice rows and cols are swapped

        // Transposing logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // printing the transpose matrix
        System.out.println("Transpose Matrix : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
