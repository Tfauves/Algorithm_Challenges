package com.company.thirtyDaysOfCode;

import java.util.Scanner;

public class Day01DataTypes {


    public class Solution {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);
            int numb;
            double dubNum;
            String str;

            numb = scan.nextInt();
            dubNum = scan.nextDouble();
            scan.nextLine();
            str = scan.nextLine();

            int sum = (i + numb);
            double dubSum = (d + dubNum);
            String message = (s + str);

            System.out.println(sum);
            System.out.println(dubSum);
            System.out.println(message);


            scan.close();
        }
    }
}
