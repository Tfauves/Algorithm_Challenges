package com.company.leetcode;

public class NumberOfOneBits {
    public static void main(String[] args) {

        int n = -2147483648;

        hammingWeigh(n);

    }

    public static int hammingWeigh(int n) {
        int oneCount = 0;
        StringBuilder bin = new StringBuilder();
        if (n < 0) {
            while (n != 0) {
                String biStr = (n < 0 ? "1" : "0");
                if (biStr.equals("1")) oneCount++;
                bin.append(biStr);
                n <<= 1;
            }
        } else {
            while (n > 0) {
                String biStr = (n % 2) == 0 ? "0" : "1";
                if (biStr.equals("1")) oneCount++;
                bin.append(biStr);

                n = n / 2;
            }
        }
        return oneCount;
    }
}
