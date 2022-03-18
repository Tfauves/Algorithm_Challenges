package com.company.codeSingnal;

public class MaxMultiple {
    public static void main(String[] args) {
        solution(3, 10);
    }

    static int solution(int divisor, int bound) {

        while (bound != divisor) {
            if (bound % divisor == 0) {
                return bound;
            } else {
                bound -= 1;
            }

            System.out.println(bound);

        }

        System.out.println(bound);
        return divisor;

    }
}
