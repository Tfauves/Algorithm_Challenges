package com.company.hackerRank.problemsolving;

public class RepeatedString {

    public static void main(String[] args) {

        repeatedString("abaabaabaa", 10);

    }


    public static long repeatedString(String s, long n) {
        int asInStr = 0;
        int count = 0;
        while (count < n) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    asInStr++;

                }
                count += i;
            }
        }

        System.out.println(asInStr);
        return asInStr;

    }
}
