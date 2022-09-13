package com.company.hackerRank.problemsolving;

public class UtopianTree {
    public static void main(String[] args) {

        utopianTree(5);
    }

    public static int utopianTree(int n) {
        int treeHeight = 0;

        for(int period = 0; period <= n; period++) {
//            System.out.println(i);
            if (period % 2 != 0) {
                treeHeight *= 2;

            } else {

                treeHeight++;
            }
        }

        System.out.println("tree height = " + treeHeight);

        return treeHeight;
    }
}
