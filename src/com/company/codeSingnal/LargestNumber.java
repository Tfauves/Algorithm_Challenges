package com.company.codeSingnal;

public class LargestNumber {
    public static void main(String[] args) {
        int number = 100;

        solution(number);
    }


    static int solution(int n) {

        double highest = Math.pow(10, n) -1;

        return (int)highest;

    }
}