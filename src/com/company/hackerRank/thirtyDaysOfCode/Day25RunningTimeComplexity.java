package com.company.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day25RunningTimeComplexity {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // square root the number to get half
        // sq root 1 -> n % = 0 not prime
        // a check for 1 if 1 thats a prime
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int input = scanner.nextInt();

            System.out.println(primeNum(input) ? "Prime" : "Not prime");
        }


    }


    static boolean primeNum(int input) {

        if (input == 1) {
            return false;
        }


        for (int i = (int)Math.sqrt(input); i > 1; i-- ) {
            if(input % i == 0) {
                return false;
            }
        }

        return true;
    }
}
