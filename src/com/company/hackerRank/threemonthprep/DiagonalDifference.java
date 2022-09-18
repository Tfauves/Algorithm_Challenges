package com.company.hackerRank.threemonthprep;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        // Final passing solution
        int absDiff = 0;
        int rightToLeft = 0;
        int leftToRight =0;
        int length = arr.size() -1;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(length --);

        }

        if (rightToLeft <= 0 && leftToRight <= 0) {
            absDiff = leftToRight - rightToLeft;
        } else {
            absDiff = rightToLeft - leftToRight;
        }


        System.out.println(absDiff);
        return Math.abs(absDiff);


    }
}
