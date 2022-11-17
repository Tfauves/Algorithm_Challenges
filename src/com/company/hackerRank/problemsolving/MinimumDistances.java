package com.company.hackerRank.problemsolving;
// TODO: 10/6/2022 not passing all cases 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 1, 3, 4, 1, 7);
        minimumDistances(input);
    }

    public static int minimumDistances(List<Integer> a) {
        int minDist = -1;
        List<Integer> distances = new ArrayList<>();

        for (int i = 0; i < a.size() -1; i++) {
            for (int j = i +1; j < a.size(); j++) {
                int diff = 0;
                if (a.get(i).equals(a.get(j))) {
                    diff = j - i;
                   distances.add(diff);
                }

            }
        }

        if (distances.isEmpty()) {
            return minDist;
        } else {
            Collections.sort(distances);
        }

        System.out.println(distances.get(0));
        return distances.get(0);

    }
}

///first attempt////////
//  int distance = 10000;
//
//        for (int current = 0; current < a.size() -1; current++) {
//
//            for (int next = current + 1; next < a.size(); next++) {
//                if ( a.get(current) == a.get(next)) {
//                    System.out.println(current);
//                    System.out.println(next);
//                    int diff = Math.abs(current - next);
//                    if(diff < distance) {
//                        distance = diff;
//                    }
//                }
//                // System.out.println(a.get(current));
//                // System.out.println(a.get(next));
//            }
//        }
//
//
////        System.out.println(distance);
//        return distance;