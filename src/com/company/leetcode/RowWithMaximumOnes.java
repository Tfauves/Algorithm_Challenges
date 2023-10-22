package com.company.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        int[][] input = {
                {0,1,0,0,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,0,1,1,0,0,1,1,0,1,0,1,1,0,0,0,1,1,1,1,1,0,1,1,0,1,0},
                {1,1,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,1,0,0,1,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,0,1,1},
                {1,1,1,0,0,1,0,1,1,0,1,1,1,0,0,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,1,0,0,1,1,1,1,0,0,0,0,0,1,1,0,1,1,0,0,1,0,0,1,0,0},
                {1,1,1,1,0,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,0,0,1,1,1,0,0,1,1,0,1,0,1,1,0,0,1,1,1,1,0,1,0,1},
                {0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,1}
        };

        rowAndMaximumOnes(input);
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        Map<Integer, Integer> onesMap = new HashMap<>();
        int[] ans = new int[2];
        int maxCount = 0;
        for (int i = 0; i < mat.length; i++) {
            int oneCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    oneCount ++;
                }

            }
            if (oneCount > maxCount) {
                maxCount = oneCount;
                onesMap.put(maxCount, i);
            }

        }

        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> item : onesMap.entrySet()) {
            int key = item.getKey();
            int val = item.getValue();

            if (key > maxKey) {
                maxKey = key;
                maxValue = val;
            }
        }
        ans[0] = maxValue;
        ans[1] = maxKey;

        System.out.println(onesMap);

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
