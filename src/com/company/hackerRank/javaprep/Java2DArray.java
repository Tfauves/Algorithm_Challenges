package com.company.hackerRank.javaprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java2DArray {
    public static void main(String[] args) {

    }

    public static void hourarray(List<List<Integer>> arr) {
        List<Integer> sums = new ArrayList<>();


        for (int row = 0; row < arr.size() -2; row++) {
            for (int col = 0; col < arr.size() -2; col++) {
                int sum = 0;
                sum += arr.get(row).get(col);
                sum += arr.get(row).get(col + 1);
                sum += arr.get(row).get(col + 2);
                sum += arr.get(row + 1).get(col + 1);
                sum += arr.get(row + 2).get(col);
                sum += arr.get(row + 2).get(col + 1);
                sum += arr.get(row + 2).get(col + 2);

                sums.add(sum);
            }
        }

        System.out.println(Collections.max(sums));

    }
}
