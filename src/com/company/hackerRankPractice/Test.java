package com.company.hackerRankPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> birdsSighted = new ArrayList<>();
        birdsSighted.add(1);
        birdsSighted.add(1);
        birdsSighted.add(2);
        birdsSighted.add(2);
        birdsSighted.add(3);

        System.out.println(migratoryBirds(birdsSighted));
    }


        public static int migratoryBirds(List<Integer> arr) {


            HashMap<Integer, Integer> birdsSpotted = new HashMap<>(); // {key=value}

            for (int i = 0; i < arr.size(); i++) {

                if (!birdsSpotted.containsKey(arr.get(i))) {
                    birdsSpotted.put(arr.get(i), 1);
                } else {
                    birdsSpotted.put(arr.get(i), birdsSpotted.get(arr.get(i) + 1));
                }
            }

            for (Integer amount : birdsSpotted.keySet()) {

                System.out.println(amount + " " + birdsSpotted);
//            if (amount > type) {
//                type = amount;
//            }
            }
            return 0;
        }


    }
