package day12_Arrays_Strings_DSA;

public class RowColumnSum_2 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 8, 6}, {2, 3, 5}, {1, 5, 8}};

        // Sum of each row
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + i + " = " + rowSum);
        }

        // Sum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Column " + j + " = " + colSum);
        }
    }
}
