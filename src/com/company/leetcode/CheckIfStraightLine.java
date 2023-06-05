package com.company.leetcode;

public class CheckIfStraightLine {
    public static void main(String[] args) {
        int[][] input = {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}};

        checkStraightLine(input);
    }

    public static boolean checkStraightLine(int[][] coordinates) {

//        To determine if a set of coordinates forms a straight line,
//        check if the slopes between consecutive points are equal.
//        If the slopes are equal, it indicates the points lie on the same line.

//        Take the first two points from the given coordinates and store their coordinates as (x1, y1) and (x2, y2) respectively. These two points will serve as reference points for slope comparison.
//        Iterate through the remaining points starting from the third point.
//        For each point (x, y) in the iteration:
//        Calculate the left-hand side of the equation: (y - y1) * (x2 - x1)
//        Calculate the right-hand side of the equation: (y2 - y1) * (x - x1)
//        Compare the left-hand side and right-hand side of the equation. If they are not equal, return false immediately, as the points do not form a straight line.
//
//      If the loop completes without returning false, return true, indicating that all the points form a straight line.
//
//      By comparing the products of differences (instead of directly dividing), we can avoid the risk of division by zero
//      dividing by (x2 - x1) can lead to an error when the points are vertically aligned.


        int len = coordinates.length;

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < len; i++) {

            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y - y1) * (x - x2) != (y - y2) * (x - x1)) {

                System.out.println("false");
                return false;
            }

        }

        System.out.println("true");
        return true;

    }
}
