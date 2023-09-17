package com.company.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO: 9/17/2023 new approach but still not working 
public class SortTheStudentsByKthScore {

    public static void main(String[] args) {
        int[][] input = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};

        sortTheStudents(input, 2);

    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int[][] answer = new int[score.length][score.length];
        int index = 0;
        Map<Integer, Integer> scoreMap = new HashMap<>();

        int studentHighScore = 0;
        int highScoreIndex = 0;
        for (int i= 0; i < score.length; i++) {
            scoreMap.put(i, score[i][k]);
        }

        for (Map.Entry<Integer, Integer> item : scoreMap.entrySet()) {
            if (item.getValue() > studentHighScore) {
                studentHighScore = item.getValue();
                highScoreIndex = item.getKey();
            }

        }

        for (int i = 0; i < score[highScoreIndex].length; i++) {
            answer[index][i] = score[highScoreIndex][i];
        }

        System.out.println(highScoreIndex);
        System.out.println(studentHighScore);

//        System.out.println(scoreMap);


       System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}
