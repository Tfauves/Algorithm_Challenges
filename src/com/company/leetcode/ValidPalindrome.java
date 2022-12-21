package com.company.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {

        isPalindrome(".");
    }

    public static boolean isPalindrome(String s) {
        boolean isValidPalindrome = false;
        if (s.equals(" ")) isValidPalindrome = true;

        String input = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (input.equals("")) isValidPalindrome = true;
        StringBuilder reverseInput = new StringBuilder();
        System.out.println(input);
        for (int i = input.length() -1; i >= 0; i--) {

            reverseInput.append(input.charAt(i));
            if (reverseInput.toString().equals(input)){
                isValidPalindrome = true;
            }
        }


        System.out.println(reverseInput);

        System.out.println(isValidPalindrome);
        return isValidPalindrome;
    }
}
