package com.company.leetcode;

import java.util.LinkedList;

public class AddDigits {
    public static void main(String[] args) {

        addDigits(38);

    }

    public static int addDigits(int num) {
        int oneDigit = 0;

        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            stack.push( num % 10 );
            num = num / 10;
        }

        while (!stack.isEmpty()) {
            oneDigit += stack.pop();

            while (oneDigit > 9) {
                stack.push( oneDigit % 10 );
                oneDigit = oneDigit / 10;
            }
//            System.out.println(stack.pop());
        }


        System.out.println(oneDigit);
        return oneDigit;
    }
}
