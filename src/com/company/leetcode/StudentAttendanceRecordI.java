package com.company.leetcode;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String test = "LLPPPLL";
//        "PPALLP"
        checkRecord(test);
    }
    public static boolean checkRecord(String s) {
        // 'A count total' must be < 2
        // L count total increments only if they are consecutive
        // if L count total must be < 3
        int totalACount = 0;
        int totalLCount = 1;

        char[] inputChars = s.toCharArray();

        for (int i = 0; i < inputChars.length -1; i++) {
            int next = i + 1;
            
            if (inputChars[i] != 'P') {
                if (inputChars[i] == 'A') {
                    totalACount++;
                    if (inputChars[i] == 'A' && inputChars[next] == 'A') totalACount++;

                    if (totalACount >= 2) {
                        System.out.println(false);
                        return false;
                    }
                }
                if (inputChars[i] == 'L') {
                    if (inputChars[next] == 'L') {
                        totalLCount++;
                    }
                    if (inputChars[next] != 'L') {
                        totalLCount = 1;
                    }

                    if (totalLCount >= 3) {
                        System.out.println(false);
                        return false;
                    }
                }
            }
        }
        System.out.println(true);
        return true;
    }
}
