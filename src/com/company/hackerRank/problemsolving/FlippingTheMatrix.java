package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingTheMatrix {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(112,42,83,119));
        arr.add(Arrays.asList(56,125,56,49));
        arr.add(Arrays.asList( 15,78, 101, 43));
        arr.add(Arrays.asList( 62,98,114,108));


        flippingMatrix(arr);

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {

        int len = matrix.size();
        int total = 0;
        for(int i = 0; i < len/2; i++) {
            for(int j = 0; j < len/2; j++) {
                int count = matrix.get(i).get(j);
                System.out.println(matrix.get(i).get(j));
                count = Integer.max(count, matrix.get(i).get(len - 1 - j));
                System.out.println(matrix.get(i).get(len - 1 - j));
                count = Integer.max(count, matrix.get(len - 1 - i).get(j));
                System.out.println(matrix.get(len - 1 - i).get(j));
                count = Integer.max(count, matrix.get(len - 1 - i).get(len - 1 - j));
                System.out.println( matrix.get(len - 1 - i).get(len - 1 - j));
                total += count;
//                System.out.println(count);
            }
        }
        System.out.println(total);
        return total;

    }


}
