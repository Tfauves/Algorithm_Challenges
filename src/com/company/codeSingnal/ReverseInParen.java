package com.company.codeSingnal;

import java.util.Stack;

public class ReverseInParen {
    public static void main(String[] args) {
        String input = "foo(bar)baz";

        solution(input);

    }

    public static String solution(String inputString) {
        StringBuilder output = new StringBuilder();
        Stack<Character> charStack = new Stack<>();
        char[] charInput = inputString.toCharArray();


        for (int i = 0; i < charInput.length; i++) {
            if (charInput[i] == '(') {
                for (int j = i +1; charInput[j] != ')'; j++) {
                    charStack.push(charInput[j]);
                }

            }
            while (!charStack.isEmpty()) {
                output.append(charStack.pop());

            }

            output.append(charInput[i]);
        }


        System.out.println(charStack);
        System.out.println(output.toString());
        return output.toString();
    }

}
