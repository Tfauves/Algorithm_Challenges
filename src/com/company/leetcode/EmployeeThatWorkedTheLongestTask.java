package com.company.leetcode;

public class EmployeeThatWorkedTheLongestTask {
    public static void main(String[] args) {
        int[][] input = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        int numOfEmp = 10;

        hardestWorker(numOfEmp, input);

    }

    public static int hardestWorker(int n, int[][] logs) {
        int maxTime = logs[0][1];
        int minEmp = logs[0][0];

        for (int i = 1; i < logs.length; i++) {
            int timeTaken = logs[i][1] - logs[i-1][1];
            int empId = logs[i][0];

            if (timeTaken > maxTime) {
                maxTime = timeTaken;
                minEmp = empId;
            } else if (timeTaken == maxTime) {
                minEmp = Math.min(empId, minEmp);
            }
        }

        System.out.println(minEmp);
        return minEmp;
    }
}
