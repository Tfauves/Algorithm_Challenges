package com.company.leetcode;

import java.util.*;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] a = {1, 1};
        int[] b = {2, 2};

        fairCandySwap(a, b);

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceTotal = 0;
        int bobTotal = 0;

        for (int aliceCandy : aliceSizes) {
            aliceTotal += aliceCandy;
        }

        for (int bobCandy : bobSizes) {
            bobTotal += bobCandy;
        }

        int diff = (aliceTotal - bobTotal) / 2;
        Set<Integer> bobCandySet = new HashSet<>();
        for (int candy : bobSizes) {
            bobCandySet.add(candy);
        }

        for (int aCandy : aliceSizes) {
            int desiredCandy = aCandy - diff;

            if (bobCandySet.contains(desiredCandy)) {
                return new int[]{aCandy, desiredCandy};
            }

        }
        return new int[2];
    }
}

