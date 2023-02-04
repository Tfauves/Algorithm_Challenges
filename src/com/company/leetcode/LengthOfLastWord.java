package com.company.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String input = "   fly me   to   the moon  ";

        lengthOfLastWord(input);
    }

    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");

//        System.out.println(strArr[strArr.length -1].length());
        return strArr[strArr.length -1].length();
    }
}
