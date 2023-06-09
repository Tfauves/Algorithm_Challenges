package com.company.leetcode;

import java.util.Arrays;

public class SortTheStudentsByKthScore {

    public static void main(String[] args) {
        int[][] input = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};

        sortTheStudents(input, 2);

    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        int[][] answer = new int[score.length][];

        for (int i = 0; i < score.length; i++) {
            answer[i] = new int[score[i].length];
        }

        int answerIndex = 0;
        int maxValueAtK = score[0][k];
        int indexOfArrWithMaxValue = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                if (j == k && maxValueAtK < score[i][j]) {
                    maxValueAtK = score[i][j];
                    indexOfArrWithMaxValue = i;
                }

            }
        }

        for (int i = indexOfArrWithMaxValue; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                answer[answerIndex][j] = score[i][j];

            }
            answerIndex++;
        }


//
//        System.out.println(maxValueAtK);
//        System.out.println(indexOfArrWithMaxValue);
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }
}
