package com.company.hackerRank.problemsolving;
// TODO: 10/1/2022 passing some but not all cases 
import java.util.*;

public class SuperReducedString {
    public static void main(String[] args) {

        superReduceString("aaabccddd");

    }

    public static String superReduceString(String input) {
        StringBuilder reducedStr = new StringBuilder();
        List<Character> letters = new ArrayList<>();

        for (Character letter : input.toCharArray()) {
            letters.add(letter);
        }

        for (int i = 0; i < letters.size() -1; i++) {
            Character current = letters.get(i);
            Character next = letters.get(i + 1);
            if (current == next) {
                letters.remove(current);

            }
            System.out.println("current " + " " + current);
            System.out.println("next " + " " + next);
        }

        System.out.println(letters);
        System.out.println(reducedStr);
        return reducedStr.toString();
    }
    // tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
}


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