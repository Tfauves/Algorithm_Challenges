package leetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,5,5,11};
        int target = 10;
       twoSum(nums, target);

    }
// iterate nums with 2 pointers if p1 + p2 = target
// return the index of p1 and the index of p2.
    public static int[] twoSum(int[] nums, int target) {
        int [] targetSumIndices = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    targetSumIndices[0] = i;
                    targetSumIndices[1] = j;

                }
            }

        }

        System.out.println(Arrays.toString(targetSumIndices));
        return targetSumIndices;
    }
}
