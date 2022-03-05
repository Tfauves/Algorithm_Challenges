package com.company.udemyCourse;

import java.util.Arrays;

public class PermMissingElement {
    public static void main(String[] args) {
        int[] test = new int[] {2, 3, 1, 5};

        solution(test);

    }
// my solution
//    static int solution(int[] a) {
//        Arrays.sort(a);
//
//        for (int i = 0; i < a.length -1; i++) {
//            int current = a[i];
//            int next = a[i + 1];
//            if (current + 1 != next) {
//                System.out.println(current += 1);
//                return current += 1;
//            }
//
//        }
//
////        System.out.println(Arrays.toString(a));
//        return 0;
//
//    }

// better solution
    static public int solution(int[] A) {
        // write your code in Java SE 8
        long actSum = 0;

        for (int num : A) {
            actSum += num;
        }

        long maxNum = A.length + 1;
        long expectedSum = (maxNum * (maxNum +1) / 2);
        return (int)(expectedSum - actSum);

    }
}
