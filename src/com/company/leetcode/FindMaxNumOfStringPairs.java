package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMaxNumOfStringPairs {
    public static void main(String[] args) {
        String[] input = {"aa","ab"};
        System.out.println(maximumNumberOfStringPairs(input));
    }

    public static int  maximumNumberOfStringPairs(String[] words) {
        int maxNumOfPairs = 0;
        String str1 = "";
        String str2 = "";
        boolean isEqual = false;

        for (int i = 0; i < words.length; i++) {
            str1 = words[i];
            for (int j = i + 1; j < words.length; j++) {
                str2 = words[j];
                isEqual = isReversedEqual(str1, str2);
                if (isEqual) maxNumOfPairs++;
            }

        }
        return maxNumOfPairs;
    }

    public static boolean isReversedEqual(String str1, String str2) {
    return str1.contentEquals(new StringBuilder(str2).reverse());

    }
}
