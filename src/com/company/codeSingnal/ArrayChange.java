package com.company.codeSingnal;

public class ArrayChange {
    public static void main(String[] args) {
        int[] input = {2, 1, 10, 1};

        System.out.println(solution(input));
    }

    public static int solution(int[] nums) {
        int moves = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= nums[i - 1]) {
                int diff = nums[i - 1] - nums[i] + 1;
                nums[i] += diff;
                moves += diff;
            }
        }
        return moves;
    }

}
