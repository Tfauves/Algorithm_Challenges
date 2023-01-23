package com.company.leetcode;

// TODO: 1/23/2023 passing 54/92 
public class FindTheTownJudge {
    public static void main(String[] args) {
        int[][] input = {{1, 3}, {2, 3}, {3, 1}};
        findJudge(3, input);
    }

    public static int findJudge(int n, int[][] trust) {
        boolean isJudge = false;
        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j < trust[i].length; j++) {
               if (trust[i][0] == n) {
                   System.out.println(-1);
                   return -1;
               }
               if (trust[i][1] == n) {
                   isJudge = true;
               }
            }
        }

        if (isJudge) {
            System.out.println(n);
            return n;
        }

        System.out.println(-1);
        return -1;
    }
}
