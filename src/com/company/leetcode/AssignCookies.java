package com.company.leetcode;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        int[] inputS = {3};

        findContentChildren(input, inputS);

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gIndex = 0;
        int sIndex = 0;
        int contentChildren = 0;

        while (gIndex < g.length && sIndex < s.length) {
            if (s[sIndex] >= g[gIndex]) {
                contentChildren++;
                gIndex++;
            }
            sIndex++;
        }

        System.out.println(contentChildren);
        return contentChildren;
    }
}
