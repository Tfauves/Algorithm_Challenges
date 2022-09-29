package com.company.hackerRank.problemsolving;

// TODO: 9/29/2022 passing some 
public class NumberLineJumps {
    public static void main(String[] args) {

        kangaroo(0, 3, 4, 2);
    }

    public static String kangaroo(int rooLoc1, int roo1MetersPerJump, int rooLoc2, int roo2MetersPerJump) {
        boolean isYes = false;
        int modRoo = rooLoc1 + roo1MetersPerJump;
        int checkRoo2 = rooLoc2 + roo2MetersPerJump;
        if (modRoo % 2 == 1) {
            isYes = true;
        }

        System.out.println((isYes) ? "YES" : "NO");
        return (isYes) ? "YES" : "NO";
    }
}
