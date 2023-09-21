package com.company.leetcode;

import java.util.*;

// TODO: 9/17/2023 new approach but still not working 
public class SortTheStudentsByKthScore {

    public static void main(String[] args) {
        int[][] input = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};

        sortTheStudents(input, 2);

    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int[][] answer = new int[score.length][score.length];
        int index1 = 0;
        int index2 = 0;
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
            answer[index1][index2] = score[highScoreIndex][i];
            index2++;

        }
        scoreMap.remove(highScoreIndex);
        index1++;

       System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}
