package com.company.leetcode;

public class CountingWordsWithGivenPrefix {
    public static void main(String[] args) {
        String[] test = {"leetcode","win","loops","success"};
        String preTest = "at";

        prefixCount(test, preTest);

    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word: words) {
            if (word.indexOf(pref) == 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
