package com.company.hackerRank.problemsolving;

public class LibraryFine {

    public static void main(String[] args) {

        libraryFine(9, 6, 2015, 6, 6, 2015);
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        int daysLate = Math.abs(d2 - d1);
        int monthsLate = Math.abs(m2 - m1);
        if (d1 > d2 && m2 == m1 && y2 == y1) {
            int fineAmt = 15 * daysLate;
            fine += fineAmt;
        }

        if (m1 > m2 && y1 == y2) {
            int fineAmt = 500 * monthsLate;
            fine += fineAmt;
        }

        if (y1 > y2) {
            fine = 10000;
        }

        if (d1 <= d2 && m1 <= m2 && y1 <= y2) {
            fine = 0;
        }

        System.out.println(fine);
        return fine;
    }

}
