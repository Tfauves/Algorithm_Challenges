package com.company.leetcode;

import java.util.Arrays;

public class MaxNumOfWordInSentence {
    public static void main(String[] args) {
        String [] test = {"please wait","continue to fight","continue to win"};

        mostWordsFound(test);

    }

    public static int mostWordsFound(String[] sentences) {
        int maxWordCount = 0;
        int wordCount = 0;

        for (String sentence : sentences) {
            String [] sentenceWords = sentence.split(" ");
            wordCount = sentenceWords.length;
            if (wordCount > maxWordCount) maxWordCount = wordCount;
        }

        return maxWordCount;
    }
}
