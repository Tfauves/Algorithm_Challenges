package com.company.leetcode;
// TODO: 10/7/2023 needs work 
import java.util.ArrayList;
import java.util.List;

public class MaximumNumberStringPairs {
    public static void main(String[] args) {
        String[] input = {"cd","ac","dc","ca","zz"};

        System.out.println(findPairs(input));

    }

    public static int findPairs(String[] words) {
        int numberOfPairs = 0;
        List<String> reversedWords = new ArrayList<>();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();
            reversedWords.add(reversed.toString());
        }

        System.out.println(reversedWords);
        return numberOfPairs;
    }
}
