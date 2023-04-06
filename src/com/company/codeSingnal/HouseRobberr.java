package com.company.codeSingnal;
// TODO: 3/15/2022 still needs finish 
import java.util.ArrayList;
import java.util.List;
//new Attempt
public class HouseRobberr {
    public static void main(String[] args) {
        int[] test = new int[] {2, 1, 3};

        solution(test);

    }

    static int solution(int[] nums) {
        int len = nums.length;
        /// case: len of input = 0 no houses available = no money!!!
        if (len == 0) return 0;
        /// case: the len of input = 1 we can only rob this location
        if (len == 1) return nums[0];

        /// holds the max amt of loot that can be robbed up to the ith house
        int[] maxLoot = new int[len];

        /// the max amt of loot from the first house.
        maxLoot[0] = nums[0];

        /// now we can rob house[0] or house[1] Math.max gives us the larger value of the two
        maxLoot[1] = Math.max(nums[0], nums[1]);

        /// now we are at the 3rd house(house[2]) we can now rob house[0] and house[2] or house[1]
        /// i init to 2 (we already have house[0] and house[1])

        for (int i = 2; i < maxLoot.length; i++) {
        /// maxLoot[i] will = the max of either the calculation or maxLoot at the prev index
            maxLoot[i] = Math.max(nums[i] + maxLoot[i -2], maxLoot[i -1]);
        }

        System.out.println(maxLoot[maxLoot.length -1]);
        return maxLoot[maxLoot.length -1];
    }
}
