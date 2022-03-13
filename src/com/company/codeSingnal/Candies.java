package com.company.codeSingnal;

public class Candies {
    int solution(int n, int m) {
        int candyPerChild = Math.round(m / n);
        candyPerChild *= n;

        return candyPerChild;

    }
}
