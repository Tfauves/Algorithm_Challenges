package com.company.hackerRank.problemsolving;
// TODO: 10/6/2022 not passing all cases 
import java.util.Arrays;
import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 1, 3, 4, 1, 7);
        minimumDistances(input);
    }

    public static int minimumDistances(List<Integer> a) {
        /*
        locate elements that are equal
        if no elements are equal return -1;
        else
        calculate the number of indices between them
        distance = j - i
        return the min distance
        1). iterate the list
        2). compare each element to the next for equality
        3). if none are equal return -1
        4). else need a counter to count indices between i and j
        5). compare each count to current count only keep the min count
        6). return count
        */

        int distance = 10000;

        for (int current = 0; current < a.size() -1; current++) {

            for (int next = current + 1; next < a.size(); next++) {
                if ( a.get(current) == a.get(next)) {
                    System.out.println(current);
                    System.out.println(next);
                    int diff = Math.abs(current - next);
                    if(diff < distance) {
                        distance = diff;
                    }
                }
                // System.out.println(a.get(current));
                // System.out.println(a.get(next));
            }
        }


//        System.out.println(distance);
        return distance;
    }
}
