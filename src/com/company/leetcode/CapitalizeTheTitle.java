package com.company.leetcode;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String test = "L hV";

        capitalizeTitle(test);

    }

    public static String capitalizeTitle(String title) {
        StringBuilder titleCaseString = new StringBuilder();

        String[] splitTitle = title.split(" ");

        for (String str : splitTitle) {
            if (str.length() == 1) {
                titleCaseString.append(str.toLowerCase()).append(" ");
                continue;
            }
            if (str.length() >= 3) {
                char[] charTitle = str.toLowerCase().toCharArray();
                charTitle[0] = Character.toUpperCase(charTitle[0]);
                titleCaseString.append(new String (charTitle)).append(" ");
            } else {
                titleCaseString.append(str.toLowerCase()).append(" ");
            }


        }

        System.out.println(titleCaseString);
        return  titleCaseString.toString().trim();
    }
}
