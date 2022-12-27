package com.company.leetcode;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        String test = "this is a test";

        reverseWords(test);
    }


    public static String reverseWords(String s) {
        String[] input = s.split(" ");
        StringBuilder reversedInput = new StringBuilder();

        for (int i = input.length -1; i >= 0; i--) {
            reversedInput.append(input[i]).append(" ");
        }

        System.out.println(new String(reversedInput));

        return reversedInput.toString().trim().replaceAll("\\s+", " ");
    }
}

//    public static String reverseWords(String s) {
//        char[] output = new char[s.length()];
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            stack.push(s.charAt(i));
//        }
//
//        int i = 0;
//        while(!stack.isEmpty()) {
//            output[i++] = stack.pop();
//        }
//
//
//        System.out.println(new String(output));
//        return new String(output);
//    }
