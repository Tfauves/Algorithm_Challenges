package com.company.hackerRank.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(2);
        test.add(3);
        test.add(1);
        test.add(2);
        pickingNumbers(test);
    }

    public static int pickingNumbers(List<Integer> a) {
        int lenSubArray =0;
        List<List<Integer>> subs = new ArrayList<>();

        Collections.sort(a);
        for (int i = 0; i < a.size() -1; i++) {
            List<Integer> newSub = new ArrayList<>();
            newSub.add(a.get(i));
            for (int j = i + 1; j < a.size(); j++) {
                int absDif = Math.abs(a.get(i) - a.get(j));

                if (absDif <= 1) {
                    newSub.add(a.get(j));
                }

            }
            subs.add(newSub);
        }

        for (List<Integer> arr : subs) {
            if (arr.size() > lenSubArray) lenSubArray = arr.size();
        }

        System.out.println(subs);
        System.out.println(lenSubArray);
        return lenSubArray;
    }
}
