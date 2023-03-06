package com.company.leetcode;

public class RingsAndRods {
    public static void main(String[] args) {

        String input = "B0R0G0R9R0B0G0";
        countPoints(input);
    }

    public static int countPoints(String rings) {
        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];
        int count = 0;

        for (int i = 0; i < rings.length(); i += 2) {
            int intValue = rings.charAt(i + 1) - '0';
            switch (rings.charAt(i)) {
                case 'R' -> r[intValue]++;
                case 'G' -> g[intValue]++;
                case 'B' -> b[intValue]++;
            }
        }

        for (int j = 0; j < 10; j++) {
            if (r[j] > 0 && g[j] > 0 && b[j] > 0) count++;
        }
        System.out.println(count);
        return count;
    }
}
