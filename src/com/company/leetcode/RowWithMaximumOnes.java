package com.company.leetcode;

import java.util.Arrays;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        int[][] input = {{0,0},{1,1}, {0,0}};

        rowAndMaximumOnes(input);
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int maxCount = 0;
        int index = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                int oneCount = 0;
                if (mat[i][j] == 1) {
                    oneCount ++;
                }
                if (oneCount > maxCount) {
                    maxCount = oneCount;
                }
                ans[0] = i;
                ans[1] = maxCount;
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
