package com.company.hackerRank.javaprep;

import java.util.Scanner;

public class JavaStringsIntro {



    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int lengthSum = (A.length() + B.length());

            System.out.println(lengthSum);
            int bigger = A.compareTo(B);

            if (bigger > 0) {
                System.out.println("Yes");
            }
            if (bigger < 0) {
                System.out.println("No");
            }

            if (bigger == 0) {
                System.out.println("No");
            }
            String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String newB = B.substring(0, 1).toUpperCase() + B.substring(1);



            System.out.print(newA + " " + newB);
        }
    }


}
