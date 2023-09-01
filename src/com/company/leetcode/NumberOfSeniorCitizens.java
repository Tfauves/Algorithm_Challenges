package com.company.leetcode;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] input = {"1313579440F2036","2921522980M5644"};
        countSeniors(input);
    }

    public static int countSeniors(String[] details) {
        int seniorCount = 0;

        for (String str : details) {
            String age = str.substring(11, 13);
            if (Integer.parseInt(age) > 60) seniorCount++;
        }
        System.out.println(seniorCount);
        return seniorCount;
    }
}
