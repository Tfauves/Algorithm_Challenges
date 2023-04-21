package com.company.leetcode;

import java.util.Arrays;

public class MinNumberOfMovesToSeat {
    public static void main(String[] args) {
        int[] inputSeats = {3, 1, 5};
        int[] inputStudents = {2, 7, 4};

        minMovesToSeat(inputSeats, inputStudents);

    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            // System.out.println(Math.abs(seats[i] - students[i]));

            moves += Math.abs(seats[i] - students[i]);
            // System.out.println(count);
        }

        System.out.println(moves);
        return moves;
    }
}
