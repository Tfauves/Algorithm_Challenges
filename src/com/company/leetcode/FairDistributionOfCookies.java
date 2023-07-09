package com.company.leetcode;

import java.util.Arrays;

public class FairDistributionOfCookies {
    public static void main(String[] args) {
        int[] cookies = {8,15,10,20,8};
        int k = 2;

        minUnfairness(cookies, k);

    }

    public static int minUnfairness(int[] cookies, int k) {
        Arrays.sort(cookies);

        int n = cookies.length;
        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int maxCookies = cookies[i + k - 1];
            int minCookies = cookies[i];
            int unfairness = maxCookies - minCookies;

            if (unfairness < minUnfairness) {
                minUnfairness = unfairness;
            }
        }

        System.out.println(minUnfairness);
        return minUnfairness;
    }

}
