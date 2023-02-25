package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String input = "abcdd";

        repeatedCharacter(input);
    }

    public static char repeatedCharacter(String s) {
        List<Integer> matchIndexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    matchIndexList.add(j);
                }
            }
        }

        System.out.println(s.charAt(Collections.min(matchIndexList)));
        return s.charAt(Collections.min(matchIndexList));
    }
}