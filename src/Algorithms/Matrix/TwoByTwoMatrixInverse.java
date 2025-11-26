package Algorithms.Matrix;

public class TwoByTwoMatrixInverse {
    public static double[][] compute(double[][] A) {
        double a = A[0][0];
        double d = A[1][1];
        double b = A[0][1];
        double c = A[1][0];

        double det = a * d - b * c;

        if (det == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted");
        }

        double[][] inverseMatrix = {
                {d / det, -b / det},
                {-c / det, a / det}
        };

        return inverseMatrix;
    }
}