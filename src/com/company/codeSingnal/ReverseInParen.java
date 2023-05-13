package com.company.codeSingnal;



public class ReverseInParen {
    public static void main(String[] args) {
        String input = "foo(bar)baz";

        solution(input);

    }

    public static String solution(String inputString) {
        return reverseInParentheses(inputString);
    }

    public static String reverseInParentheses(String inputString) {

        StringBuilder str = new StringBuilder();
        int start = 0;
        int end = inputString.length() - 1;
        str.setLength(0);
        if (inputString.contains("(")) {
            start = inputString.lastIndexOf("(");
            end = inputString.indexOf(")", start);
            str.append(inputString, start+1, end);
            return reverseInParentheses(inputString.substring(0, start) + str.reverse().toString() + inputString.substring(end+1));
        }
        System.out.println(inputString);
        return inputString;
    }

}

///first attempt
//    public static String solution(String inputString) {
//        StringBuilder output = new StringBuilder();
//        Stack<Character> charStack = new Stack<>();
//        char[] charInput = inputString.toCharArray();
//        int i = 0;
//
//
//        for (; i < charInput.length; i++) {
//            if (charInput[i] == '(') {
//                for (int j = i +1; charInput[j] != ')'; j++) {
//                    charStack.push(charInput[j]);
//                    i = j + 1;
//                }
//
//            }
//            while (!charStack.isEmpty()) {
//                output.append(charStack.pop());
//
//            }
//
//            if (charInput[i] != '(' && charInput[i] != ')') {
//                output.append(charInput[i]);
//
//            }
//
//        }
//
//
//        System.out.println(charStack);
//        System.out.println(output.toString());
//        return output.toString();
//    }