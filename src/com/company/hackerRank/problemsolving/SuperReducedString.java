package com.company.hackerRank.problemsolving;

import java.util.*;

public class SuperReducedString {
    public static void main(String[] args) {

        superReducedString("aaabccddd");

    }

    public static String superReducedString(String input) {
        // Write your code here
        StringBuilder reducedStr = new StringBuilder(input);
        for (int i = 0; i < reducedStr.length() - 1; i++) {
            if (reducedStr.charAt(i) == reducedStr.charAt(i + 1)) {
                reducedStr.delete(i, i + 2);
                i = -1;
            }
        }
        if (reducedStr.length() == 0) {

            return "Empty String";
        }
        System.out.println(reducedStr);
        return String.valueOf(reducedStr);
    }
}
    // tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh


/////// first attempt
    // create char array of string characters
    // iterate the char array and build new string with any remaining chars
    // if char array is empty return "Empty String"
//
//    StringBuilder newStr = new StringBuilder();
//    List<Character> inputToArr = new ArrayList<>();
//
//        for (Character letter : s.toCharArray()) {
//                inputToArr.add(letter);
//                }
//
//                for (int i = 1; i < inputToArr.size(); i++) {
//        Character prev = inputToArr.get(i -1);
//        Character current = inputToArr.get(i);
//
//        if (current.equals(prev)) {
//
//        inputToArr.remove(current);
//        inputToArr.remove(prev);
//        i = 0;
//        }
//
//        }
//
//        for (Character letter : inputToArr) {
//        newStr.append(letter);
//        }
//
//
//        if (newStr.isEmpty()) newStr.append("Empty String");
//        System.out.println(newStr);
//        return newStr.toString();