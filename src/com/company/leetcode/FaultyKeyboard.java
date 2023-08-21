package com.company.leetcode;

public class FaultyKeyboard {
    public static void main(String[] args) {

        String input = "poiinter";
        finalString(input);
    }

    public static String finalString(String s) {
        StringBuilder currentStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'i') {
                currentStr.append(s.charAt(i));
            } else {
                currentStr = currentStr.reverse();
            }
        }

        System.out.println(currentStr.toString());
        return currentStr.toString();

    }

    /// found out later that stringbuilder has its own reverse method baked in whoops...
//    public static StringBuilder reverse(StringBuilder inputToReverse){
//        StringBuilder reversedStr = new StringBuilder();
//
//        for (int i = inputToReverse.length() -1; i >= 0; i--) {
//            reversedStr.append(inputToReverse.charAt(i));
//        }
////        System.out.println(reversedStr);
//        return reversedStr;
//    }
}
