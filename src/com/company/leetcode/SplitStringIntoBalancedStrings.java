package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

// TODO: 5/1/2023 stuck??? 
public class SplitStringIntoBalancedStrings {
    public static void main(String[] args) {
        String input = "RLRRLLRLRL";

        balancedStringSplit(input);

    }

    public static int balancedStringSplit(String s) {
        int numOfBalencedSubStr = 0;
        List<String> subStrList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i +1; j < s.length(); j++) {
                subStrList.add(s.substring(i, j));
            }

        }


        System.out.println(subStrList);
        return numOfBalencedSubStr;
    }
}
