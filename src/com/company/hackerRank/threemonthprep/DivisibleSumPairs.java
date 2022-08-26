package com.company.hackerRank.threemonthprep;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        List<Integer> test = new ArrayList<>();
//        1 3 2 6 1 2
        test.add(1);
        test.add(3);
        test.add(2);
        test.add(6);
        test.add(1);
        test.add(2);
        divisibleSumPairs(n, k , test);
    }


    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // determine number of i, j pairs where i < j and ar[i] + ar[j] is divisible by k
        // n = length of ar
        // k = interger divisor
        // return int (the number of pairs)
        // look at first element and sum with next element
        // if sum % k == 0
        // paircount++
        int pairCount = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                int sum = ar.get(i) + ar.get(j);

                if (sum % k == 0) {
                    pairCount++;
                }
            }
        }
        System.out.println(pairCount);
        return pairCount;

    }

}
