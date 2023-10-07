package com.company.leetcode;

public class RemoveColoredPiecesOfSameColor {
    public static void main(String[] args) {

        String input = "ABBBBBBBAAA";

        System.out.println(checkColors(input));
    }

    public static boolean checkColors(String colors) {
        int AMoves = 0;
        int BMoves = 0;
        for (int i = 1; i < colors.length() -1; i++) {
            if (colors.charAt(i) == 'A') {
                if (colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                    AMoves++;
                }
            }
        }

        for (int i = 1; i < colors.length() -1; i++) {
            if (colors.charAt(i) == 'B') {
                if (colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                    BMoves++;
                }
            }
        }
        System.out.println(AMoves);
        System.out.println(BMoves);
        return AMoves > BMoves;
    }
}
