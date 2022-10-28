package com.company.hackerRank.thirtyDaysOfCode;

public class Day29BitwiseAnd {

    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if((i & j) > max && (i &j ) < K ) {
                    max = i & j;
                }
            }
        }

        return max;
    }

}
