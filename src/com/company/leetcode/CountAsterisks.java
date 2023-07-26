package com.company.leetcode;

public class CountAsterisks {
    public static void main(String[] args) {
//        String s = "l|*e*et|c**o|*de|";
        String s = "yo|uar|e**|b|e***au|tifu|l";

        countAsters(s);

    }

    public static int countAsters(String s) {
        int count = 0;
        boolean inPair = false;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                inPair = !inPair;
            } else if (c == '*' && !inPair) {
                count++;
            }
        }

        System.out.println(count);
        return count;

    }
}
