package com.company.leetcode;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {

        String a = "11";
        String b = "1";

        addBinary(a, b);
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            sum = carry;

            if (i >= 0) sum = sum + a.charAt(i) - '0';
            if (j >= 0) sum = sum + b.charAt(j) - '0';

            result.append((char)(sum % 2 + '0'));
            carry = sum / 2;
            i--;
            j--;

        }
        System.out.println(result.reverse().toString());
        return result.reverse().toString();
    }
}
