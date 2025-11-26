package Tests;
import utils.Matrix;
import Algorithms.Matrix.TwoByTwoMatrixInverse;

public class TwoByTwoMatrixInverseTest {
    public static void main(String[] args) {
        double[][] matrix = {
                {4, 7},
                {2, 6}
        };

        Matrix.printMatrix(TwoByTwoMatrixInverse.compute(matrix));
    }
}
