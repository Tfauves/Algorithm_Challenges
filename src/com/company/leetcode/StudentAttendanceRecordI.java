package com.company.leetcode;

// TODO: 1/20/2023 passing 106 out of 113 trouble edge case with array size of 0 
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String test = "AA";
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

                    if (totalACount >= 2) {
                        System.out.println(false);
                        return false;
                    }
                }
                if (inputChars[i] == 'L') {
                    if (inputChars[next] == 'L') {
                        totalLCount++;
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
