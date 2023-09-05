package com.company.leetcode;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfDifferentIntegersInString {
    public static void main(String[] args) {

        String input = "leet1234code234";

        numDifferentIntegers(input);
    }
    // passes but needed help to get here
    public static int numDifferentIntegers(String word) {
        String result = word.replaceAll("[^0-9]", " ");
        String[] tokens = result.split(" ");

        HashSet<String> uniqueIntegers = new HashSet<>();

        for (String token : tokens) {
            if (!token.isEmpty()) {
                uniqueIntegers.add(token.replaceFirst("^0+(?!$)", ""));
            }
        }
        return uniqueIntegers.size();
    }

}
// attempt 1 did not pass
//    public int numDifferentIntegers(String word) {
//        String result = word.replaceAll("[^0-9]", " ");
//
//        Pattern pattern = Pattern.compile("\\s(?!0)\\d+\\s");
//        Matcher matcher = pattern.matcher(" " + result + " ");
//
//        int digitSequenceCount = 0;
//        while (matcher.find()) {
//            digitSequenceCount++;
//        }
//
//        System.out.println(digitSequenceCount);
//        return digitSequenceCount;
//    }
