package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String input = "au";
        lengthOfLongestSubstring(input);

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int len = s.length();

        Set<Character> charSet = new HashSet<>();

        int i = 0, j = 0;

        while (i < len && j < len) {
            if (!charSet.contains(s.charAt(j))) {

                charSet.add(s.charAt(j));
                maxCount = Math.max(maxCount, j - i + 1);
                j++;
            } else {

                charSet.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println(maxCount);
        return maxCount;
    }
}
