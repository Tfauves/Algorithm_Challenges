package com.company.codeSingnal;


import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
//        int[] test = new int[] {1, 1, 2, 2, 1};
        int[] test = new int[] {2, 1, 3, 5, 3, 2};

        solution(test);

    }

    static int solution(int[] a) {
        Set<Integer> dups = new HashSet<>();

        for(int i = 0; i < a.length; i++){
            int num = a[i];
            if(dups.contains(num)) {
                return num;
            }

            dups.add(num);
        }

        return -1;

    }

}


/// attempt that fails 2 time complexity cases
//    Map<Integer, Integer> dups = new HashMap<>();
//
//        for (int i = 0; i < a.length; i++) {
//        for (int j = i + 1; j < a.length; j++) {
//            if (a[i] == a[j]) {
//                dups.put(j, a[i]);
//            }
//        }
//    }
//
//        if (dups.isEmpty()){
//        return -1;
//    }
//
//    int minValue = Collections.min(dups.keySet());
//        System.out.println(minValue);
//        return dups.get(minValue);
//
//}







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