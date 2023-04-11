package com.company.leetcode;

public class NumOfStudentsDoingHomeworkAtTime {
    public static void main(String[] args) {
        int[] sTime = {1, 2, 3};
        int[] eTime = {3, 2, 7};

        busyStudent(sTime, eTime, 4);

    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int numberOfStudents = 0;

        for (int i = 0; i < startTime.length; i++) {
            for (int j = startTime[i]; j <= endTime[i]; j++) {
                if (j == queryTime) numberOfStudents++;
            }
        }
        System.out.println(numberOfStudents);
        return numberOfStudents;
    }
}
