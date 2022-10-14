package com.company.hackerRank.problemsolving.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiDArray {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> one = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> two = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> three = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> four = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> five = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> six = Arrays.asList(0, 0, 1, 2, 4, 0);
        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        arr.add(five);
        arr.add(six);

        hourglassSum(arr);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
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
        return (sums.size() > 0) ? Collections.max(sums) : 0 ;

    }
}
