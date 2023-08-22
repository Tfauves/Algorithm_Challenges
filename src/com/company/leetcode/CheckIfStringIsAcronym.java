package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CheckIfStringIsAcronym {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("alice");
        input.add("bob");
        input.add("charlie");

        String s = "abc";

        isAcronym(input, s);

    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder check = new StringBuilder();

        for (String word : words) {
            check.append(word.charAt(0));
        }

        return check.toString().equals(s);
    }
}
