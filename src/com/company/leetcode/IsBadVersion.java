package com.company.leetcode;

// TODO: 6/19/2023 no passing leetcode but passes for me in ide 
public class IsBadVersion {
    public static void main(String[] args) {

        int n = 5;
        int b = 4;

        isBadV(n, b);

    }

    public static int isBadV(int n, int b) {
        int[] versions = new int[n +1];

        for (int i = 0; i <= n; i++) {
            versions[i] = i;
        }

        int left = 0;
        int right = versions.length -1;
        int middle = (left + right) / 2;

        if ((versions[middle]) != b) {
            while (left <= middle) {

                if (b == versions[left]) {
                    System.out.println(versions[left]);
                    return versions[left];
                }
                left++;
            }

            while (right >= middle) {
                if (b == versions[right]) {
                    System.out.println(versions[right]);
                    return versions[right];
                }
                right--;
            }

        }

        System.out.println(versions[middle]);
        return versions[middle];

    }
}
