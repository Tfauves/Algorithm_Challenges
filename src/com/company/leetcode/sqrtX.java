package com.company.leetcode;

public class sqrtX {
    public static void main(String[] args) {

        mySqrt(4);
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;

        int start = 1, end = x;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                System.out.println(mid);
                return mid;
            }
            else if (mid > x / mid) {
                end = mid;
            }else {
                start = mid + 1;
            }

        }

        System.out.println(start);
        return start;
    }
}
