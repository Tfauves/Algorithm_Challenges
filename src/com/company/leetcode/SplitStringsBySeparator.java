package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("one.two.three");
        input.add("four.five");
        input.add("six");


        char separator = '.';
        System.out.println(splitWordsBySeparator(input, separator));

    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (c == separator) {
                    if (currentWord.length() > 0) {
                        result.add(currentWord.toString());
                        currentWord = new StringBuilder();
                    }
                } else {
                    currentWord.append(c);
                }
            }
            if (currentWord.length() > 0) {
                result.add(currentWord.toString());
            }
        }
        return result;
    }
}
