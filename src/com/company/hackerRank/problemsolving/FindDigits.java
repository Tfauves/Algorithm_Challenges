package com.company.hackerRank.problemsolving;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// TODO: 11/4/2022 not passing first test 
public class FindDigits {
    public static void main(String[] args) {

        findDigits(114108089);

    }
// 123456789 114108089 110110015 121 33 44 55 66 77 88 106108048
//    3 3 6 2 2 2 2 2 2 2 5
    public static int findDigits(int n) {
        // given an interger of each digit that makes up the int
        // determine if it is a divisor
        // count the number of divisors
        // if n % d = 0 then d is a divisor of n

        // break n into individual ints
        // check if these ints are divisiors of the original int
        // for each int that is a divisor count++;

        int divisors = 0;

        int compare = n;
        int indiDigits = 0;

        Deque<Integer> digits = new ArrayDeque<>();

        while (compare > 0) {
//            System.out.println(indiDigits % 10);
            indiDigits = compare % 10;
            compare /= 10;
             digits.add(indiDigits);
        }
//        System.out.println(digits);
        while (!digits.isEmpty()) {

//            System.out.println(digits.peek());
            int num = digits.pop();
//            System.out.println(num);
            if (num == 0) {
                continue;
            }
//            System.out.println(num % n);
//            System.out.println(num /= n);
//            System.out.println(num);
            if ((n / num) % 2 == 0) {
                divisors++;
            }
        }

//        System.out.println(n);
//        System.out.println(digits);
        System.out.println(divisors);
        return divisors;

    }
}
