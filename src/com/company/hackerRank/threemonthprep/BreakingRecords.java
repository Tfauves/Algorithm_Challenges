package com.company.hackerRank.threemonthprep;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        // 10 5 20 20 4 5 2 25 1

        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        breakingRecords(scores);




    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // number of times record for min and record for max is broken
        // points scored  in the first game establish the record
        // scores = [] of points scored per game

        // return int [] with number of times record for min and record for max is broken
        List<Integer> numberOfTimesRecordBroken = new ArrayList<>();
        Integer minCount = 0;
        Integer maxCount = 0;
        Integer min  = 0;
        Integer max = 0;


        for (int i = 0; i < scores.size(); i++) {
            if (i == 0) {
                 min = scores.get(0);
                 max = scores.get(0);
            }


            if (scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            }

            if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }


        }

        numberOfTimesRecordBroken.add(maxCount);
        numberOfTimesRecordBroken.add(minCount);
        System.out.println(numberOfTimesRecordBroken);
        return numberOfTimesRecordBroken;


    }
}
