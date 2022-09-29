package com.company.hackerRank.problemsolving;

public class NumberLineJumps {
    public static void main(String[] args) {

        kangaroo(0, 3, 4, 2);
    }

    public static String kangaroo(int rooLoc1, int roo1MetersPerJump, int rooLoc2, int roo2MetersPerJump) {
        boolean isYes = false;
        int roo1JumpCount = 0;
        int roo2JumpCount = 0;

        if (rooLoc1 < rooLoc2) {
            while (rooLoc1 < rooLoc2) {
                rooLoc1 += roo1MetersPerJump;
                rooLoc2 += roo2MetersPerJump;
                roo1JumpCount++;
                roo2JumpCount++;
                if (roo1JumpCount == roo2JumpCount && rooLoc1 == rooLoc2) {
                    isYes = true;
                }
            }
        }

        if (rooLoc2 < rooLoc1) {
            while (rooLoc2 < rooLoc1) {
                rooLoc1 += roo1MetersPerJump;
                rooLoc2 += roo2MetersPerJump;
                roo1JumpCount++;
                roo2JumpCount++;
                if (roo1JumpCount == roo2JumpCount && rooLoc1 == rooLoc2) {
                    isYes = true;
                }
            }
        }



        System.out.println((isYes) ? "YES" : "NO");
        return (isYes) ? "YES" : "NO";
    }
}
