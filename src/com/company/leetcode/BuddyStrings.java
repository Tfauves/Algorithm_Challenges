package com.company.leetcode;

import java.util.Stack;

// TODO: 7/3/2023 needs work 
public class BuddyStrings {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "aa";

        solution(s, goal);

    }

    public static boolean solution(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {
                if (s.charAt(i) == goal.charAt(i + 1)) {
                    if (s.charAt(i + 1) == goal.charAt(i)) {
                        System.out.println(true);
                        return true;
                    }
                }

            }
        }
        System.out.println(false);
        return false;

    }
}

/// attempt 1
//    int len = goal.length() -1;
//    int letterMatchCount = 0;
//    int i = 0;
//
//        while (len >= 0) {
//
//                if (goal.charAt(len) == s.charAt(i)) {
//                letterMatchCount++;
//                len--;
//                i++;
//                }
//                }
//
//                System.out.println(letterMatchCount == s.length());
//                return letterMatchCount == s.length() - 1;


/// attempt 2
//    Stack<Character> myStack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//        myStack.push(s.charAt(i));
//        }
//
//        for (int i = 0; i < goal.length(); i++) {
//        if (myStack.peek() == goal.charAt(i)) {
//        myStack.pop();
//        }
//        }
//
//        System.out.println(myStack.isEmpty());
//        return myStack.isEmpty();