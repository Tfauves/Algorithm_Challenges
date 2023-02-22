package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>();
        List<String> one = new ArrayList<>();
        one.add("qqqq");
        one.add("qqqq");
        one.add("qqqq");
        List<String> two = new ArrayList<>();
        two.add("qqqq");
        two.add("qqqq");
        two.add("qqqq");
        List<String> three = new ArrayList<>();
        three.add("qqqq");
        three.add("qqqq");
        three.add("qqqq");

        input.add(one);
        input.add(two);
        input.add(three);

        String ruleK = "name";
        String ruleV = "qqqq";

        countMatches(input, ruleK, ruleV);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int numOfMatches = 0;


        for (int i = 0; i < items.size(); i++) {

                switch (ruleKey) {
                    case "type": if (items.get(i).get(0).equals(ruleValue)) numOfMatches++;
                        break;
                    case "color": if (items.get(i).get(1).equals(ruleValue)) numOfMatches++;
                        break;
                    case "name": if (items.get(i).get(2).equals(ruleValue)) numOfMatches++;
                        break;

                }

        }
        System.out.println(numOfMatches);
        return numOfMatches;
    }
}
