package com.company.hackerRank.problemsolving;

import java.util.*;

// TODO: 9/30/2022 passing only 8 cases 
public class SuperReducedString {
    public static void main(String[] args) {

        superReduceString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh");

    }

    public static String superReduceString(String s) {
        // create char array of string characters
        // copy char array into a stack
        // if pop char == the char in char array remove char from array
        // iterate the char array and build new string with any remaining chars
        // if char array is empty return "Empty String"

        StringBuilder newStr = new StringBuilder();
        List<Character> inputToArr = new ArrayList<>();

        for (Character letter : s.toCharArray()) {
            inputToArr.add(letter);
        }

        for (int i = 1; i < inputToArr.size(); i++) {
            Character prev = inputToArr.get(i -1);
            Character current = inputToArr.get(i);

            if (current.equals(prev)) {
                inputToArr.remove(current);
                inputToArr.remove(prev);
                i = 0;
            }

        }

        for (Character letter : inputToArr) {
            newStr.append(letter);
        }


        if (newStr.isEmpty()) newStr.append("Empty String");
        System.out.println(newStr);
        return newStr.toString();
    }

    // tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
}
