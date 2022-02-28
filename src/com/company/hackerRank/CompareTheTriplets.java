package com.company.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(3);
        b.add(2);
        b.add(1);


        System.out.println(compareTriplets(a,b));

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer aScore = 0;
        Integer bScore = 0;
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aScore++;
            }

            if (b.get(i) > a.get(i)) {
                bScore++;
            }
        }

        scores.add(aScore);
        scores.add(bScore);

        return scores;
    }
}