package com.company.hackerRank.problemsolving;
import java.util.LinkedList;

public class FindDigits {
    public static void main(String[] args) {

        findDigits(1012);

    }
// 123456789 114108089 110110015 121 33 44 55 66 77 88 106108048
//    3 3 6 2 2 2 2 2 2 2 5
    public static int findDigits(int n) {
        int divisorCount = 0;
        int number = n;
        LinkedList<Integer> indiDigits = new LinkedList<>();
        while (number > 0) {
            indiDigits.push(number % 10);
            number = number / 10;
        }

        while((!indiDigits.isEmpty())) {
//            System.out.println(indiDigits.pop());
            int digit = indiDigits.pop();
            if (digit == 0) {
                continue;
            }
            if (n % digit == 0) {
                divisorCount++;
            }
        }

        System.out.println(divisorCount);
        return divisorCount;
    }
}

//// first attempt ////////
//    int divisors = 0;
//
//    int compare = n;
//    int indiDigits = 0;
//
//    Deque<Integer> digits = new ArrayDeque<>();
//
//        while (compare > 0) {
////            System.out.println(indiDigits % 10);
//                indiDigits = compare % 10;
//                compare /= 10;
//                digits.add(indiDigits);
//                }
////        System.out.println(digits);
//                while (!digits.isEmpty()) {
//
////            System.out.println(digits.peek());
//                int num = digits.pop();
////            System.out.println(num);
//                if (num == 0) {
//                continue;
//                }
////            System.out.println(num % n);
////            System.out.println(num /= n);
////            System.out.println(num);
//                if ((n / num) % 2 == 0) {
//                divisors++;
//                }
//                }
//
////        System.out.println(n);
////        System.out.println(digits);
//                System.out.println(divisors);
//                return divisors;
