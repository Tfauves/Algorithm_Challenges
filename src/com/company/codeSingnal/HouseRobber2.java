package com.company.codeSingnal;

import java.util.ArrayList;
import java.util.List;
//new Attempt
public class HouseRobber2 {
    public static void main(String[] args) {
        int[] test = new int[] {2, 7, 9, 3, 1};

        solution(test);

    }

    static int solution(int[] nums) {
        List<Integer> lootPossiblities = new ArrayList<>();

        int max_loot = 0;

        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 2; j < nums.length; j++) {
                int loot = nums[i] + nums [j];
                lootPossiblities.add(loot);
            }
        }

        for (Integer loot : lootPossiblities) {
            if (loot > max_loot) {
                max_loot = loot;
            }
        }

        System.out.println(max_loot);
        return max_loot;
    }
}
