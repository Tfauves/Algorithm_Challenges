package com.company.codeSingnal;

public class CircleOfNumbers {
    int solution(int n, int firstNumber) {
        int oppositeNumber = n / 2 + firstNumber;

        if (oppositeNumber >= n) {
            oppositeNumber -= n;
            return oppositeNumber;
        }

        return oppositeNumber;
    }
}
