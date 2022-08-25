package com.company.hackerRank.threemonthprep;

import java.util.List;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {
        long maxSum = 0;
        long minSum = 0;
        long maxEle = 0;
        long minEle = Integer.MAX_VALUE;
        long totalSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxEle) {
                maxEle = arr.get(i);

            }
            if (arr.get(i) < minEle) {
                minEle = arr.get(i);
            }

            totalSum += arr.get(i);
            maxSum = (long)totalSum - minEle;
            minSum = (long)totalSum - maxEle;

        }

        System.out.println(minSum + " " + maxSum);


    }

}

