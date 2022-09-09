package com.company.hackerRank.threemonthprep;

import java.util.ArrayDeque;

public class MarsExploration {

    public static void main(String[] args) {
        marsExploration("SOSSOSSOS");
        // SOSSPSSQSSOR
        // SOSSOT
        // SOSSOSSOS
    }
    public static int marsExploration(String s) {
        int mutLetters = 0;
        ArrayDeque<Character> message = new ArrayDeque<>();
        for (Character letter : s.toCharArray()) {
            message.add(letter);

        }

        while (!message.isEmpty()) {
            char[] signal = {'S', 'O', 'S'};

            for (Character sigLetter : signal) {
                System.out.println(message.peek());
                if (message.peek() == 'S') {
                    message.pop();
                }
                System.out.println(message.peek());
                if (message.peek() == 'O') {
                    message.pop();
                }
                System.out.println(message.peek());
                if (message.peek() == 'S') {
                    message.pop();
                } else{
                    break;
                }
            }
            if (message.isEmpty()) break;
            mutLetters++;
            message.pop();

        }
        System.out.println(mutLetters);
        return mutLetters;
    }
}
