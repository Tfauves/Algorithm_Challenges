package com.company.hackerRank.prep;

public class StairCase {
    public static void main(String[] args) {
        int n = 4;
        staircase(n);
    }

    public static void staircase(int n) {
        int h = n -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < h) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");

                }

            }
            System.out.println();
            h = h - 1;
        }


    }
}
