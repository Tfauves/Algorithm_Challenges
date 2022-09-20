package com.company.hackerRank.javaprep;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    class UsernameValidator {
        // must consist of 8 to 30 chars inclusive
        // can contain alphnumeric chars and underscores lower and uppercased 0-9
        // first char must be of alphabet either lower or uppercase


        public static final String regularExpression = "^[a-zA-Z][A-Za-z0-9_]{7,29}";
    }


    public class Solution {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
