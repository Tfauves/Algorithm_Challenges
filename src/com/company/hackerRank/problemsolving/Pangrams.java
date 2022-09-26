package com.company.hackerRank.problemsolving;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pangrams {
    public static void main(String[] args) {

        pangrams("We promptly judged antique ivory buckles for the next prize");
    }

    public static String pangrams(String s) {
        boolean isPangram = false;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> alphaMap = new HashMap();

        for (char letter : alphabet) {

        }


        System.out.println((isPangram) ? "pangram" : "not pangram");
        return (isPangram) ? "pangram" : "not pangram";
    }
}
//    boolean blnResult = Arrays.equals(charArray1,charArray2);
//    System.out.println("Are two char arrays equal ? : " + blnResult);