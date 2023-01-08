package com.company.leetcode;

import java.util.Stack;

// TODO: 1/8/2023 passing 85 of 92 
public class ValidParentheses {

    public static void main(String[] args) {
        String test = "((";
        isValid(test);
    }


    public static boolean isValid(String s) {
        Stack<Character> container = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                container.push(currentChar);
            } else {
                if (container.isEmpty()) {
                    return false;
                }
                char containerPeek = container.peek();
                if ((currentChar == ')' && containerPeek != '(') || (currentChar == ']' && containerPeek != '[') || (currentChar == '}' && containerPeek != '{')) {
                    return false;
                } else {
                    container.pop();
                }
            }


        }
        return true;
    }

}

///// first attempt 34 of 92 /////
//public static boolean isValid(String s) {
//    boolean flag = false;
//    int len = s.length();
//
//    for (int i = 0; i < len; i++) {
//        for (int j = i + 1; j < len; j++) {
//            if (s.charAt(i) == '{' && s.charAt(j) == '}') {
//                flag = true;
//                break;
//            }
//            if (s.charAt(i) == '(' && s.charAt(j) == ')') {
//                flag = true;
//                break;
//            }
//
//            if (s.charAt(i) == '[' && s.charAt(j) == ']') {
//                flag = true;
//                break;
//            }
//        }
//    }
//
//    System.out.println(flag);
//    return flag;
//}