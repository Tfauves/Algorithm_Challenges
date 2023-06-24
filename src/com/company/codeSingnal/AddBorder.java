package com.company.codeSingnal;

import java.util.Arrays;

public class AddBorder {
    public static void main(String[] args) {
       String[] picture = {"abc", "ded"};

       solution(picture);

    }

    public static String[] solution(String[] picture) {
        int numRows = picture.length;
        int numCols = picture[0].length();

        // Create a new array with increased dimensions
        String[] result = new String[numRows + 2];

        // Add top border
        result[0] = generateBorder(numCols);

        // Copy the original matrix and add side borders
        for (int i = 0; i < numRows; i++) {
            result[i + 1] = "*" + picture[i] + "*";
        }

        // Add bottom border
        result[numRows + 1] = generateBorder(numCols);

        System.out.println(Arrays.toString(result));
        return result;

    }

    private static String generateBorder(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length + 2; i++) {
            sb.append("*");
        }
        return sb.toString();
    }




}
