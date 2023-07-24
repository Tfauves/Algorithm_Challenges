package com.company.leetcode;

public class RaiseToPow {
    public static void main(String[] args) {

       double x = 2.0000;
       int n = 10;

        raiseThis(x, n);

    }

    public static double raiseThis(double x, int n) {

        System.out.println(Math.pow(x, n));
        return Math.pow(x, n);
    }
}
