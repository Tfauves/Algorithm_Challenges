package com.company.codeSingnal;

public class ExtraNumber {
    int solution(int a, int b, int c) {
        int notSame = 0;

        if (a == b) {
            notSame = c;
        }

        if (b == c) {
            notSame = a;
        }

        if (a == c){
            notSame = b;
        }

        return notSame;

    }
}
