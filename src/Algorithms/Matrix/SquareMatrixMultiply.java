package Algorithms.Matrix;

public class SquareMatrixMultiply {
    /*
        Time Complexity: O(n^3)
        Space Complexity: O(n^2)
     */
    public static int[][] squareMatrixMultiply(int[][] A, int[][] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("Matrices must be the same dimension");
        }

        int n = A.length;
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] = c[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        return c;
    }
}