package com.company.hackerRank.problemsolving;

import java.util.Arrays;
import java.util.List;

// TODO: 10/2/2022 cannot figure out why ouput doesnt match  
public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(26,94,-95,34,67,-97,17,52,1,86);
        angryProfessor(7, test);
    }

    public static String angryProfessor(int cancelThresh, List<Integer> arrivalTimes) {
        // if student arrival time <= 0 the student is ontime
        // if the amt of students that are ontime >= cancelThresh

        // start with total student count len of list
        // decrement student count for those that are late.

        boolean haveClass = true;
        int studentCount = arrivalTimes.size();

        for (Integer aTime : arrivalTimes) {
            if (aTime > 0) studentCount--;
        }

        if (studentCount >= cancelThresh) haveClass = false;
        // System.out.println(lateStudentCount);
        // System.out.println((haveClass) ? "YES" : "NO");
        return (haveClass) ? "YES" : "NO";
    }


    // first attempt
//    public static String angryProfessor(int cancelThresh, List<Integer> arrivalTimes) {
//        // if student arrival time <= 0 the student is ontime
//        // if the amt of students that are ontime >= cancelThresh
//        boolean haveClass = true;
//        int lateStudentCount = 0;
//
//        for (Integer aTime : arrivalTimes) {
//            if (aTime > 0) lateStudentCount++;
//        }
//
//        if (lateStudentCount >= cancelThresh) haveClass = false;
//        System.out.println(lateStudentCount);
//        System.out.println((haveClass) ? "YES" : "NO");
//        return (haveClass) ? "YES" : "NO";
//    }

}
