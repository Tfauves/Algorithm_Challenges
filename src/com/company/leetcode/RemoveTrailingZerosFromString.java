package com.company.leetcode;

public class RemoveTrailingZerosFromString {
    public static void main(String[] args) {

        String input = "51230100";

        removeTrailingZeros(input);

    }

    public static String removeTrailingZeros(String num) {
        int endIdx = num.length() -1;

        while (endIdx >= 0 && num.charAt(endIdx) == '0') {
            endIdx--;
        }

        System.out.println(num.substring(0, endIdx +1));
        return num.substring(0, endIdx +1);
    }
}
