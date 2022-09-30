package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> testA = new ArrayList<>();
        List<Integer> testB = new ArrayList<>();
        testA.add(2);
        testA.add(4);

        testB.add(16);
        testB.add(32);
        testB.add(96);

        getTotalX(testA, testB);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // find the int that is to be considered
        // the int to be considered is a factor of all elements of the 2nd array
        // the nums in the first array are factors of the num to be considered
        // these nums are "between the two arrays"
        // count and return the number of nums "between the two arrays"
        int numsBetween = 0;

        for (int i = 0; i < b.size(); i++) {
            int divisor = 0;

            for (int j = 0; j < a.size(); j++) {
                System.out.println(b.get(i));
                System.out.println(a.get(j));
            }
        }



        return numsBetween;
    }
}
