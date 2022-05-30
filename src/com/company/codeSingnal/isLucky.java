package com.company.codeSingnal;

import java.util.HashMap;
import java.util.Map;

public class isLucky {
    public static void main(String[] args) {
        solution(11);
    }

    static boolean solution(int n) {

        String temp = Integer.toString(n);
        int[] numbArr = new int[temp.length()];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < temp.length(); i++) {
            numbArr[i] = temp.charAt(i) - '0';

        }

        for (int i = 0; i < numbArr.length; i++) {

            if ((int)i < numbArr.length / 2) {
                sum1 += numbArr[i];
            } else {
                sum2 += numbArr[i];
            }
        }
        if (sum1 == sum2) {
            System.out.println("true");
            return true;
        }

        System.out.println(false);
        return false;



    }
}
