package com.company.hackerRank.thirtyDaysOfCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Day18QueuesAndStacks {

    public class Solution {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        // Write your code here.
        void pushCharacter(char ch) {
            stack.push(ch);
        }

        void enqueueCharacter(char ch) {
            queue.add(ch);
        }

        char popCharacter() {
            return stack.pop();
        }

        char dequeueCharacter() {
            return queue.remove();
        }

    }
}
