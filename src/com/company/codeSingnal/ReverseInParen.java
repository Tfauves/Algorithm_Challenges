package com.company.codeSingnal;

import java.util.Stack;

// TODO: 4/17/2023 not passing nested parens
public class ReverseInParen {
    public static void main(String[] args) {
        String input = "foo(bar)baz";

        solution(input);

    }

    public static String solution(String inputString) {
        StringBuilder output = new StringBuilder();
        Stack<Character> charStack = new Stack<>();
        char[] charInput = inputString.toCharArray();
        int i = 0;


        for (; i < charInput.length; i++) {
            if (charInput[i] == '(') {
                for (int j = i +1; charInput[j] != ')'; j++) {
                    charStack.push(charInput[j]);
                    i = j + 1;
                }

            }
            while (!charStack.isEmpty()) {
                output.append(charStack.pop());

            }

            if (charInput[i] != '(' && charInput[i] != ')') {
                output.append(charInput[i]);

            }

        }


        System.out.println(charStack);
        System.out.println(output.toString());
        return output.toString();
    }

}
