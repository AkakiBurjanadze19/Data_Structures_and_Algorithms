package Tests;
import utils.Matrix;
import Algorithms.Matrix.SquareMatrixMultiply;

public class SquareMatrixMultiplyTest {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {4, 5}
        };
        int[][] matrix2 = {
                {1, 2},
                {4, 5}
        };

        Matrix.printMatrix(SquareMatrixMultiply.squareMatrixMultiply(matrix1, matrix2));
    }
}
