package com.company.leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc" ;

        isSubsequence(s, t);
    }

    public static boolean isSubsequence(String s, String t){
        int subIndex = 0;
        if (s.equals("")) return true;

        for (int i = 0; i < t.length(); i++) {

            // Characters match, move to the next character in the subsequence
            if (t.charAt(i) == s.charAt(subIndex)) subIndex++;

            // Check if all characters of the subsequence have been found
            if (subIndex == s.length()) return true;

            // Break the loop if the remaining characters in t are less than the remaining characters in s
            if (t.length() - i - 1 < s.length() - subIndex) break;

        }
            // Return false if all characters of the subsequence are not found
        return subIndex == s.length();
    }
}
