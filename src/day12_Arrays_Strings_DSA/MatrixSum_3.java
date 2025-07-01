package day12_Arrays_Strings_DSA;

public class MatrixSum_3 {
    public static void main(String[] args) {
        int[][] mat = {
                {5, 10},
                {15, 20},
                {25, 30}
        };
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
        }
        System.out.println("Total Sum : " + sum);
    }
}
