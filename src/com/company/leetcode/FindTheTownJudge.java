package com.company.leetcode;

// TODO: 1/24/2023 not complete 54/92
public class FindTheTownJudge {
    public static void main(String[] args) {
        int[][] input = {{1, 3}, {2, 3}, {3, 1}};
        findJudge(3, input);
    }
//    In a town, there are n people labeled from 1 to n.
//    One of these people could secretly be the town judge.

//    If the town judge exists, then:
    //    The town judge trusts nobody.
    //    Everybody (except for the town judge) trusts the town judge.
    //    There is exactly one person that satisfies properties 1 and 2.
//
//    You are given an array trust where trust[i] = [ai, bi]
//    representing that the person labeled ai trusts the person labeled bi.
//
//    Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
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


