package com.company.leetcode;

import java.util.Arrays;

public class ConvertTheTemp {
    public static void main(String[] args) {

        double input = 36.50;
        convertTemperature(input);

    }

    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        double tempToKel = celsius + 273.15;
        double tempToFar = (celsius * 1.80) + 32.00;

        answer[0] = tempToKel;
        answer[1] = tempToFar;


        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
