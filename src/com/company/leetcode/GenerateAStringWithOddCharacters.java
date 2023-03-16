package com.company.leetcode;

public class GenerateAStringWithOddCharacters {
    public static void main(String[] args) {

        generateTheString(4);

    }

    public static String generateTheString(int n) {
        StringBuilder output = new StringBuilder();
       if (n % 2 == 1) {
           for (int i = 1; i <= n; i++) {
               output.append("a");
           }
       } else {
           for (int i = 1; i <= n -1; i++) {
               output.append("a");
           }
           output.append("b");
       }
        System.out.println(output.toString());
        return output.toString();
    }
}
