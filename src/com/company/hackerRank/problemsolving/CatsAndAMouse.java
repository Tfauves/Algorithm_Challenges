package com.company.hackerRank.problemsolving;

public class CatsAndAMouse {

    static String catAndMouse(int catA, int catB, int mouseC) {
        // catA gets to mouse first print cat A
        // catB gets to mouse first print cat B
        // if cats are tied in moves print mouse C

        int catADist = Math.abs(catA - mouseC);
        int catBDist = Math.abs(catB - mouseC);
        String winner = " ";
        if (catADist < catBDist) winner = "Cat A";

        if (catBDist < catADist) winner =  "Cat B";

        if (catADist == catBDist) winner = "Mouse C";

        return winner;

    }
}
