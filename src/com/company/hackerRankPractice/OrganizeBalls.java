package com.company.hackerRankPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class OrganizeBalls {
    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> cont1 = new ArrayList<>();
        List<Integer> cont2 = new ArrayList<>();
        List<Integer> cont3 = new ArrayList<>();
        cont1.add(1);
        cont1.add(3);
        cont1.add(1);
//       cont1.add(1);
//       cont1.add(1);
//       cont2.add(1);
//       cont2.add(1);

        cont2.add(2);
        cont2.add(1);
        cont2.add(2);

        cont3.add(3);
        cont3.add(3);
        cont3.add(3);

        test.add(cont1);
        test.add(cont2);
        test.add(cont3);

        organizingContainers(test);



    }


    public static String organizingContainers(List<List<Integer>> container) {
        Map<Integer, Integer> ballMap = new HashMap<>();
        Map<Integer, Integer> capacity = new HashMap<>();

        for (int i = 0; i < container.size(); i++) {
            Integer capSum = 0;
            //index of containers
            Integer containerIndex = i;
//            System.out.println(containerIndex);
            for (int j = 0; j < container.get(i).size(); j++) {
//                System.out.println( j + ": " + container.get(i).get(j));
                Integer ballType = j;
//                System.out.println(ballType);
                Integer ballAmt = container.get(i).get(j);
//                System.out.println(ballAmt);
//                System.out.println(ballType + ": " + ballAmt);
                capSum += ballAmt;

                capacity.put(containerIndex, capSum);


                if (!ballMap.containsKey(ballType)) {
                    ballMap.put(ballType, ballAmt);
                }else {
                    ballMap.put(ballType, ballMap.get(ballType) + ballAmt);
                }

            }

        }

        for (Integer ball : ballMap.keySet()) {
//            System.out.println(ball + ": " + ballMap.get(ball));

            Integer ballTypoQt = ballMap.get(ball);

            for (Integer con : capacity.keySet()) {
//                System.out.println("ball capacity of container " + con + " is : " + capacity.get(con));
                Integer containerCap = capacity.get(con);

                if ( ballTypoQt == containerCap ) {
                    capacity.remove(con);
                    break;

                }

            }
            if (capacity.isEmpty()) {
//               System.out.println("Possible");
                return "Possible";

            }
        }

//        System.out.println("Impossible");
        return "Impossible";

    }
}
