package com.company.leetcode;

public class CheckIfTwoStringArraysAreEqual {
    public static void main(String[] args) {
        String[] w1 = {"ab", "c"};
        String[] w2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(w1, w2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder concatW1 = new StringBuilder();
        StringBuilder concatW2 = new StringBuilder();

        for (String str : word1) {
            concatW1.append(str);
        }

        for (String str: word2) {
            concatW2.append(str);
        }

        return concatW1.toString().equals(concatW2.toString());

    }
}
