package com.company.codeSingnal;

import java.util.Arrays;

public class AreSimilar {

    public static void main(String[] args) {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

        solution(a, b);

    }

    public static boolean solution(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        if (Arrays.equals(a, b)) {
            return true;
        }

        int firstDiffIndex = -1;
        int secondDiffIndex = -1;
        int diffCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                diffCount++;

                if (diffCount == 1) {
                    firstDiffIndex = i;
                } else if (diffCount == 2) {
                    secondDiffIndex = i;
                } else {
                    return false;
                }
            }
        }

        return (diffCount == 2 && a[firstDiffIndex] == b[secondDiffIndex] && a[secondDiffIndex] == b[firstDiffIndex]);
    }

}
