public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotated = new int[matrix[0].length][matrix.length];
        int rowCount = 0;
        int columnCount = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                rotated[rowCount][columnCount] = matrix[j][i];
                columnCount++;
            }
            rowCount++;
            columnCount = 0;
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] test = { { 1, 2, 3 }, { 7, 7, 3 }, { 10, 5, 6 } };
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
        test = rotateMatrix(test);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
