package com.company.leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String w1 = "abcd";
        String w2 = "pq";

        mergeAlternately(w1, w2);

    }

    public static  String mergeAlternately(String word1, String word2) {
        StringBuilder outputStr = new StringBuilder();

        if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                outputStr.append(word1.charAt(i));
                outputStr.append(word2.charAt(i));
            }
            for (int j = word1.length(); j < word2.length(); j++) {
                outputStr.append(word2.charAt(j));
            }

        } else if (word2.length() < word1.length()) {
            for (int i = 0; i < word2.length(); i++) {
                outputStr.append(word1.charAt(i));
                outputStr.append(word2.charAt(i));
            }
            for (int j = word2.length(); j < word1.length(); j++) {
                outputStr.append(word1.charAt(j));
            }

        } else {
            for (int i = 0; i < word1.length(); i++) {
                outputStr.append(word1.charAt(i));
                outputStr.append(word2.charAt(i));
            }
        }


        System.out.println(outputStr.toString());
        return outputStr.toString();
    }
}
