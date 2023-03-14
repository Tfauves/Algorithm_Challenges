package com.company.leetcode;

import java.util.Stack;

public class FirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] input = {"abc","car","ada","racecar","cool"};

        firstPalindrome(input);

    }

    public static boolean isPalindrome(String str)
    {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reverseInput = new StringBuilder();
            for (int i = word.length() -1; i >= 0; i--) {
                reverseInput.append(word.charAt(i));
                if (reverseInput.toString().equals(word)){
                    System.out.println(word);
                    return word;
                }
            }
        }
        return " ";
    }
}
