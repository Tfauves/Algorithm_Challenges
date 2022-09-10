package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class DivisableSumPairs {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        // 1 3 2 6 1 2
        test.add(1);
        test.add(3);
        test.add(2);
        test.add(6);
        test.add(1);
        test.add(2);
        divisibleSumPairs(6, 3, test);

    }

    public static int divisibleSumPairs(int len, int divisor, List<Integer> ar) {

        int match = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {

                int sum = ar.get(i) + ar.get(j);
                System.out.println(sum);
                if(sum % divisor == 0) {

                    match++;


                }
            }
        }
        System.out.println(match);

        return match;

    }
}
