package com.company.leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        transpose(input);

    }

    public static int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] newMatrix = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newMatrix));
        return newMatrix;
    }
}
