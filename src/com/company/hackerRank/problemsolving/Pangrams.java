package com.company.hackerRank.problemsolving;

import java.util.*;

public class Pangrams {
    public static void main(String[] args) {

        pangrams("We promptly judged antique ivory buckles for the next prize");
    }

    public static String pangrams(String s) {
        boolean isPangram = false;
        int count = 0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> alphaMap = new HashMap();

        for(char letter : alphabet) {
            alphaMap.put(letter, 0);
        }

        for (char sLetter : s.toLowerCase().toCharArray()) {
            if (sLetter != ' ') {
                if (!alphaMap.containsKey(sLetter)) {
                    alphaMap.put(sLetter, 1);
                } else {
                    alphaMap.put(sLetter, alphaMap.get(sLetter) + 1);
                }
            }


        }

        for(Integer value : alphaMap.values()) {
            if (value != 0) {
               count++;
            }
        }

        if(count >= 26) {
            isPangram = true;
        }
        System.out.println(alphaMap);
        System.out.println((isPangram) ? "pangram" : "not pangram");
        return (isPangram) ? "pangram" : "not pangram";
    }
}
