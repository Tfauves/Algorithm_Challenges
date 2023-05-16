package com.company.leetcode;


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

        int[] trusts = new int[n+1];
        int[] trustedBy = new int[n+1];

        for (int i = 0; i < trust.length; i++) {

            trusts[trust[i][0]] ++;
            trustedBy[trust[i][1]] ++;
        }

        for(int i = 1; i <= n; i++) {
            if(trusts[i] == 0 && trustedBy[i] == n-1) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(-1);
        return -1;
    }
}


