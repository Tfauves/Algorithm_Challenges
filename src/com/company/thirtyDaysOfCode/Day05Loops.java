package com.company.thirtyDaysOfCode;

public class Day05Loops {

    public static void main(String[] args) {
        // write your code here
        int n = 3;

        for (int i = 1; i <= 10; i++) {

            int product = n * i;
            String message = n + " x " + i + " = " + product;
            System.out.println(message);
        }
    }

}
