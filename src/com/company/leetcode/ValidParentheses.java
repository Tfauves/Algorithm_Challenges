package com.company.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String test = "((";
        isValid(test);
    }


    public static boolean isValid(String s) {
        Stack<Character> container = new Stack<>();

        // convert string into char array and access the characters using for each loop.
        for (char input : s.toCharArray())
        {
            // check ch
            switch (input)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    container.push(input);
                    break;
                case ')':
                    if(container.isEmpty() || container.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(container.isEmpty() || container.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(container.isEmpty() || container.pop() != '[')
                    {
                        return false;
                    }
                    break;
                default: return false;
            }
        }
        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        if(container.isEmpty())
            return true;
        else
            return false;

    }

}

//public static boolean isValid(String s) {
//    Stack<Character> container = new Stack<>();
//    if (s.length() == 1) return false;
//    for (int i = 0; i < s.length(); i++) {
//        char currentChar = s.charAt(i);
//        if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
//            container.push(currentChar);
//        } else {
//            if (container.isEmpty()) {
//                return false;
//            }
//            char containerPeek = container.peek();
//            if ((currentChar == ')' && containerPeek != '(' )|| (currentChar == ']' &&      containerPeek != '[') || (currentChar == '}' && containerPeek != '{')) {
//                return false;
//            } else {
//                container.pop();
//            }
//        }
//
//    }
//    return true;
//
//}

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