package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> con1 = new ArrayList<>();
        List<Integer> con2 = new ArrayList<>();
        con1.add(1);
        con1.add(2);
        con2.add(2);
        con2.add(2);
        test.add(con1);
        test.add(con2);

        organizingContainers(test);



    }

    public static String organizingContainers(List<List<Integer>> container) {
        HashMap<Integer, Integer> ballMap = new HashMap<>();
        Map<Integer, Integer> capacity = new HashMap<>();

        for (int i = 0; i < container.size(); i++) {
            Integer capSum = 0;
            Integer containerIndex = i;
            for (int j = 0; j < container.get(i).size(); j++) {
                Integer ballType = j;
                Integer ballAmt = container.get(i).get(j);
                capSum += ballAmt;

                capacity.put(containerIndex, capSum);
// TODO: 2/5/2022 something is not right hereish 
                if (!ballMap.containsKey(ballType)) {
                    ballMap.put(ballType, ballAmt);
                }else {
                    ballMap.put(ballType, ballAmt +1);
                }
            }


        }

        for (Integer cap : capacity.keySet()) {
            System.out.println(cap + " " + capacity.get(cap));
        }

        for (Integer ball : ballMap.keySet()) {
            System.out.println(ball + ": " + ballMap.get(ball));
        }

        return "";

    }


}
