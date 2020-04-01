package core.basesyntax;

public class MatrixOperation {

    public int[] getDiagonal(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    public int []getCounterDiagonal(int[][] matrix) {
        int[] result = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][matrix.length - 1 - i];
        }
        return result;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
