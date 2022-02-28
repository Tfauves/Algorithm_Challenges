package com.company.hackerRank.thirtyDaysOfCode;

import java.util.Scanner;

public class Day06LetsReview {

    public class Solution {

        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            //System.out.println("Enter number of test cases: ");
            int testCaseNum = myScanner.nextInt();
            myScanner.nextLine();
            for (int i = 0; i < testCaseNum; i++) {
                String even = "";
                String odd = "";
                //System.out.println("Enter a String: ");
                String userStr = myScanner.nextLine();

                for (int j = 0; j < userStr.length(); j += 2){
                    even += userStr.charAt(j);
                }


                for (int j = 1; j < userStr.length(); j += 2) {
                    odd += userStr.charAt(j);
                }

                System.out.println(even + " " + odd);
            }

        }
    }

}
