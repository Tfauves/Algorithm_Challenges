package com.company.hackerRank.threemonthprep;

import java.util.ArrayDeque;

public class MarsExploration {

    public static void main(String[] args) {
        marsExploration("SOSSPSSQSSOR");

    }
    public static int marsExploration(String s) {
        int mutLetters = 0;
        ArrayDeque<Character> message = new ArrayDeque<>();
        for (Character letter : s.toCharArray()) {
            message.add(letter);

        }

        while(!message.isEmpty()) {
            if (message.peek().equals('S')) {
                message.pop();
                if(message.peek().equals('O')){
                    message.pop();
                } else {
                    mutLetters++;
                    message.pop();
                }
                mutLetters++;
                message.pop();
            }
        }

        // message.peek();

        // System.out.println(message);
        // System.out.println(message.peek());
        // System.out.println(message.pop());


        // System.out.println(message);
        return mutLetters;

    }
}
