import java.util.ArrayList;
import java.util.List;

/**
 * ZeroMatrix
 */
public class ZeroMatrix {

    public static int[][] zeroMatrix(int[][] matrix) {
        List<Integer> rowZeroes = new ArrayList<Integer>();
        List<Integer> columnZeroes = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZeroes.add(i);
                    columnZeroes.add(j);
                }
            }
        }
        for (int i = 0; i < rowZeroes.size(); i++) {
            nullifyRow(matrix, rowZeroes.get(i));
        }
        for (int i = 0; i < columnZeroes.size(); i++) {
            nullifyColumn(matrix, columnZeroes.get(i));
        }
        return matrix;
    }

    public static void nullifyColumn(int[][] matrix, int column) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row][column] = 0;
        }
    }

    public static void nullifyRow(int[][] matrix, int row) {
        for (int column = 0; column < matrix[0].length; column++) {
            matrix[row][column] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] testMatrix = new int[][] { { 0, 3, 3 }, { 3, 3, 3 }, { 3, 3, 0 } };
        for (int i = 0; i < testMatrix.length; i++) {
            for (int j = 0; j < testMatrix[i].length; j++) {
                System.out.print(testMatrix[i][j]);
            }
            System.out.println();
        }
        testMatrix = zeroMatrix(testMatrix);
        for (int i = 0; i < testMatrix.length; i++) {
            for (int j = 0; j < testMatrix[i].length; j++) {
                System.out.print(testMatrix[i][j]);
            }
            System.out.println();
        }
    }
}