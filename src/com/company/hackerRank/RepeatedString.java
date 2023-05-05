package com.company.hackerRank;

public class RepeatedString {
    public static void main(String[] args) {
        String input = "aba";
        long n = 10;

        repeatedString(input, n);

    }

    public static long repeatedString(String s, long n) {
        long strLen = s.length();
        int aCount = 0;

        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        long repeatedTimes = n / strLen;
        long strLeftLen = n - strLen * repeatedTimes;
        int extraAs = 0;

        for (int i = 0; i < strLeftLen; i++) {
            if (s.charAt(i) == 'a') extraAs++;
        }

        long totalCount = repeatedTimes * aCount + extraAs;

        return totalCount;
    }
}
