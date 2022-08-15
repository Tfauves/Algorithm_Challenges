package com.company.codeSingnal;

import java.util.Arrays;

public class MatrixElementSum {
    public static void main(String[] args) {
        int [][] matrix =   {{0, 1, 1, 2},
                             {0, 5, 0, 0},
                             {2, 0, 3, 3}};
        solution(matrix);

    }

    public static int solution(int[][] matrix) {
        int sum = 0;

        for(int col = 0; col < matrix[0].length; col++) {

            for (int row = 0; row < matrix.length; row++) {

                if ( matrix[row][col] == 0) {
                    break;
                }
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
        return sum;

    }
}
