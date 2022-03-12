package Chapter1;

import java.util.Arrays;

public class MatrixZero1_8 {

    /**
     * Program to set entire row and column of matrix to 0 if an element in N*M matrix is 0. Console output:
         * Before converting matrix into zero
         * 1  2  3  8  4  5
         * 34 5  7  8  9  6
         * 23 56 0  3  9  1
         * 8  5  6  1  2  9
         * Before converting matrix into zero
         * 1  2  0  8  4  5
         * 34 5  0  8  9  6
         * 0  0  0  0  0  0
         * 8  5  0  1  2  9
     *
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,8,4,5},
                {34,5,7,8,9,6},
                {23,56,0,3,9,1},
                {8,5,6,1,2,9}
        };
        System.out.println("Before converting matrix into zero");
        displayMatrix(matrix);
        addZerosToMatrix(matrix);
        System.out.println("Before converting matrix into zero");
        displayMatrix(matrix);
    }

    private static void addZerosToMatrix(int[][] matrix) {
        boolean firstRowZero = false, firstColumnZero =false;

        for(int columnIndex=0; columnIndex<matrix[0].length;columnIndex++){
            if(matrix[0][columnIndex] == 0){
                firstRowZero = true;
                break;
            }
        }
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                firstColumnZero = true;
                break;
            }
        }

        for(int i=1; i< matrix.length; i++) {
            for(int j=1; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i< matrix.length; i++) {
            for(int j=1; j<matrix[0].length; j++) {
                if(matrix[0][j] == 0 || matrix[i][0]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero) {
            Arrays.fill(matrix[0], 0);
        }
        if(firstColumnZero) {
            for(int i=0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
                if (ints[j] < 10)
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
