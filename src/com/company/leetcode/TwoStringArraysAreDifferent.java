package com.company.leetcode;

public class TwoStringArraysAreDifferent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        arrayStringsAreEqual(word1, word2);

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder strWord1 = new StringBuilder();
        StringBuilder strWord2 = new StringBuilder();

        for (String word : word1) {
            strWord1.append(word);
        }

        for (String word : word2) {
            strWord2.append(word);
        }

        return strWord1.toString().equals(strWord2.toString());

    }
}
