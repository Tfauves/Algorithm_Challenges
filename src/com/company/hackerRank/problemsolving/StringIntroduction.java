package com.company.hackerRank.problemsolving;

public class StringIntroduction {
    public static void main(String[] args) {

        Stringer("hello", "java");

    }

    public static void Stringer(String A, String B) {
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