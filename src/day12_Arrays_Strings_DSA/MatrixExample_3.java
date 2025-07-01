package day12_Arrays_Strings_DSA;

public class MatrixExample_3 {
    public static void main(String[] args) {
        int[][] matix = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};

        System.out.println("Matrix:");
        for (int i = 0; i < matix.length; i++) {
            for (int j = 0; j < matix[i].length; j++) {
                System.out.print(matix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
