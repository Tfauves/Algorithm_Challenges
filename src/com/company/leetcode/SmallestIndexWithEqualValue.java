package com.company.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8,9,0};
        smallestEqual(input);

    }

    public static int smallestEqual(int[] nums) {
        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if( i % 10 == nums[i]) {
                indexList.add(i);
            }
        }

        if (!indexList.isEmpty()) {
            System.out.println(Collections.min(indexList));
            return Collections.min(indexList);
        } else {
            System.out.println(-1);
            return -1;
        }

    }
}
