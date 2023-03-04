package com.company.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseWordsOfStringIII {
    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";

        reverseWords(input);

    }

    public static String reverseWords(String s) {
        String[] strSplit = s.split(" ");
        List<String> stringList = new ArrayList<>();
        for (String word : strSplit) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                stringBuilder.append(word.charAt(i));
            }
            stringList.add(stringBuilder.toString());
        }
        System.out.println(String.join(" ", stringList));
        return String.join(" ", stringList);
    }
}
