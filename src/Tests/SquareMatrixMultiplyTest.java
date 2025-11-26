package Tests;
import utils.Matrix;
import Algorithms.Matrix.SquareMatrixMultiply;

public class SquareMatrixMultiplyTest {
    public static void main(String[] args) {
        double[][] matrix1 = {
                {1, 2},
                {4, 5}
        };
        double[][] matrix2 = {
                {1, 2},
                {4, 5}
        };

        Matrix.printMatrix(SquareMatrixMultiply.compute(matrix1, matrix2));
    }
}
