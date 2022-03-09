package com.company.codeSingnal;

import java.util.ArrayList;
import java.util.List;

public class AddTwoDigits {
    public static void main(String[] args) {
        int digit = 12;

        solution(digit);

    }

    static int solution(int n) {
        List<Integer> digits = new ArrayList<Integer>();
        int sum = 0;
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        for (Integer num : digits) {
             sum += num;

        }

        return sum;

    }


}
