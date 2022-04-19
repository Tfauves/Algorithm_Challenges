package com.company.codeSingnal;

public class almostIncreasingSequence {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 5, 3, 5};
//        int[] test = new int[]{1, 2, 1, 2};
//        int[] test = new int[]{1, 1, 2, 3, 4, 4};
//        int[] test = new int[]{1, 2, 3, 4, 3, 6};
//        int[] test = new int[]{40, 50, 60, 10, 20, 30};
        solution(test);

    }

    static boolean solution(int[] sequence) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) count1++;
        }

        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] >= sequence[i + 2]) count2++;
        }

        return (count1 <= 1) && (count2 <= 1);
    }
}

// attempt passes 17 of 19
//    int count = 0;
//        int previous = 0;
//        int next = 0;
//        for (int i = 0; i < sequence.length; i++) {
//            int current = sequence[i];
//            if (i == sequence.length -1) {
//                next = current;
//            } else {
//
//                next = sequence[i + 1];
//            }
//
//
//            if ( i != 0) {
//                previous = sequence[i - 1];
//            }
//
//            if (current > next) {
//
//                count++;
//            }
//
//            else if (next == previous || previous == current) {
//                count++;
//            }
//
//            if(count > 1) {
//                System.out.println("false");
//                return false;
//            }
//
//        }
//
//        System.out.println("true");
//        return true;
