package com.company.codeSingnal;

public class ShapeArea {
    int solution(int n) {
        if (n == 1) {
            return n;

        }

        if (n == 0) {
            return n;
        }

        int soulution = n * n + (n-1) * (n-1);

        return soulution;
    }
}
