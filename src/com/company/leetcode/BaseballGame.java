package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
        String[] input = {"1","C"};
        calPoints(input);

    }

    public static int calPoints(String[] operations) {
        int sumOScores = 0;
        List<Integer> scores = new ArrayList<>();
        int index = -1;

        for (int i = 0; i < operations.length; i++) {

            switch (operations[i]) {
                case "+":
                    int sum = scores.get(index) + scores.get(index -1);
                    scores.add(sum);
                    index++;
                    break;
                case "D":
                    int product = scores.get(index) * 2;
                    scores.add(product);
                    index++;
                    break;
                case "C":
                    scores.remove(scores.get(index));
                    index--;
                    break;

                default:
                    scores.add(Integer.parseInt(operations[i]));
                    index++;
                    break;
            }

        }

        for (Integer record : scores) {
            sumOScores += record;
        }



        System.out.println(scores);
        System.out.println(sumOScores);

        return sumOScores;
    }
}
