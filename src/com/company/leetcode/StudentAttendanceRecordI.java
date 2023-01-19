package com.company.leetcode;

// TODO: 1/19/2023 not passing because must take consecutive letters into consideration 
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String test = "PPALLL";
//        "PPALLP"
        checkRecord(test);
    }
    public static boolean checkRecord(String s) {
        int pCount = 0;
        int lCount = 0;
        int aCount = 0;
        int tooLate = 3;
        int tooAbsent = 2;
        char[] inputChars = s.toCharArray();

        for (Character ch : inputChars) {
            switch (ch) {
                case 'P' -> pCount++;
                case 'L' -> lCount++;
                case 'A' -> aCount++;
                default -> {
                }
            }

        }

        return lCount < tooLate && aCount < tooAbsent;
    }

}
