package com.company.hackerRank.problemsolving;

import java.util.ArrayDeque;

// TODO: 9/22/2022 does not pass all cases 
public class FindDigits {
    public static void main(String[] args) {

        findDigits(1012);

    }


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

        ArrayDeque<Integer> digits = new ArrayDeque<>();

        while (compare > 0) {
//            System.out.println(indiDigits % 10);
            indiDigits = compare % 10;
            compare /= 10;
             digits.add(indiDigits);
        }
        while (!digits.isEmpty()) {
            System.out.println(digits.peek());
            int num = digits.pop();
            if (num == 0) {
                continue;
            }
            System.out.println(num % n);
            num /= n;
            if (num % 2 == 0) {
                divisors++;
            }
        }

//        System.out.println(n);
//        System.out.println(digits);
        System.out.println(divisors);
        return divisors;

    }
}
