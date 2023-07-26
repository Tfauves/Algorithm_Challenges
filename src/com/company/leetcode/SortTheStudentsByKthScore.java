package com.company.leetcode;

import java.util.Arrays;

// TODO: 7/26/2023 needs work
public class SortTheStudentsByKthScore {

    public static void main(String[] args) {
        int[][] input = {{3, 4}, {5, 6}};

        sortTheStudents(input, 0);

    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int[][] answer = new int[score.length][score.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                answer[i][j] = score[i][j];

            }
        }

        System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}
