package com.company.codeSingnal;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// TODO: 3/13/2022 attempt passes all but 2 time complexity cases.
public class FirstDuplicate {
    public static void main(String[] args) {
//        int[] test = new int[] {1, 1, 2, 2, 1};
        int[] test = new int[] {2, 1, 3, 5, 3, 2};

        solution(test);

    }

    static int solution(int[] a) {
        Map<Integer, Integer> dups = new HashMap<>();


//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    dups.put(j, a[i]);
//                }
//            }
//        }

//        HashSet<Integer> ch = new HashSet<>();
//        for(int i=0;i<a.length;i++){
//            int num = a[i];
//            if(ch.contains(num)) return num;
//            ch.add(num);
//        }
//        return -1;

        System.out.println(dups);

        if (dups.isEmpty()) {
            return -1;
        }

        int minValue = Collections.min(dups.keySet());
        System.out.println(dups.get(minValue));
        return dups.get(minValue);

    }
}
//  attempt solves 10 of 12
//    int solution(int[] a) {
//        Map<Integer, Integer> dups = new HashMap<>();
//
//        for (int i = 0; i < a.length -1; i++) {
//            if (a[i] == a[i +1]) {
//                dups.put(i, a[i]);
//            }
//
//        }
//
//        for (Integer index : dups.keySet()) {
//            int minIndex = Collections.min(dups.keySet());
//
//            if (index <= minIndex) {
//                return dups.get(index);
//            }
//        }
//
//
//        return -1;
//
//
//    }
