package com.company.leetcode;

public class BuddyStrings {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "aa";

        solution(s, goal);

    }

    public static boolean solution(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] charCount = new int[26];
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
                if (charCount[c - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        }

        int firstDiff = -1;
        int secondDiff = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstDiff == -1) {
                    firstDiff = i;
                } else if (secondDiff == -1) {
                    secondDiff = i;
                } else {
                    return false; // More than two differences, cannot be swapped
                }
            }
        }

        return (secondDiff != -1 && s.charAt(firstDiff) == goal.charAt(secondDiff) &&
                s.charAt(secondDiff) == goal.charAt(firstDiff));

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