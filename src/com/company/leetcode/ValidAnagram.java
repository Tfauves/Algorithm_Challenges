package com.company.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        isAnagram("anagram", "nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        // check if str len are equal if not return false
        if (s.length() != t.length()) return false;
        // cast both str to lowercase
        // create 2 char[] representing the str
        char[] str1 = s.toLowerCase().toCharArray();
        char[] str2 = t.toLowerCase().toCharArray();
        // sort the char[]
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
