package com.company.leetcode;

public class TruncateSentence {
    public static void main(String[] args) {
        String input = "chopper is not a tanuki";
        truncateSentence(input, 5);
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder output = new StringBuilder();
        String[] sWords = s.split(" ");

        for (int i = 0; i < k; i++) {
            output.append(sWords[i]).append(" ");
        }

        System.out.println(output.toString());
        return output.toString().trim();
    }
}
