package com.company.hackerRank.problemsolving;
import java.util.*;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> testA = new ArrayList<>();
        List<Integer> testB = new ArrayList<>();
        testA.add(1);
//        testA.add(4);

//        testB.add(16);
        testB.add(72);
        testB.add(48);

        getTotalX(testA, testB);
    }


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // find the factors of each element in list a
        // find the factors of each element in list b
        // every factor num from list b that are the same as factor num in list a betweenNums++;
        int betweenNums = 0;
        Map<Integer, Integer> factors = new HashMap<>();
        for (Integer number : a) {
            for (int i = 1; i <= Collections.min(b); i++) {
                if (i % number == 0) {
                    if(!factors.containsKey(i)) {
                        factors.put(i, 1);
                    } else {
                        factors.put(i, factors.get(i) +1);
                    }

                }

            }
        }

        for (Integer num : b) {
            for (int i = 1; i <= num; i ++) {
                if (num % i == 0) {
                    if (!factors.containsKey(i)) {
                        factors.put(i, 1);
                    } else {
                        factors.put(i, factors.get(i) +1);
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> factor : factors.entrySet()) {
            Integer factNum = factor.getKey();
            Integer freq = factor.getValue();
            Integer lens = b.size() + a.size();

            if(Objects.equals(freq, lens)) {
                betweenNums++;
            }

        }
//        System.out.println(factors);
//        System.out.println(betweenNums);
        return betweenNums;

    }


}




///////////////// first attempt /////////////
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // find the int that is to be considered
//        // the int to be considered is a factor of all elements of the 2nd array
//        // the nums in the first array are factors of the num to be considered
//        // these nums are "between the two arrays"
//        // count and return the number of nums "between the two arrays"
//        int numsBetween = 0;
//
//        for (int i = 0; i < b.size(); i++) {
//            int divisor = 0;
//
//            for (int j = 0; j < a.size(); j++) {
//                System.out.println(b.get(i));
//                System.out.println(a.get(j));
//            }
//        }
//
//
//
//        return numsBetween;
//    }

/////////////////// second attempt ///////////////////////////////////////
//    Set<Integer> betweeners = new HashSet<>();
//    int numsBetween = 0;
//
//        for (Integer setANums : a) {
//        for (int i = 1; i <= setANums; i ++) {
//            if (setANums % i == 0)
//                System.out.println(setANums);
////                betweeners.add(setANums);
//        }
//    }
//
//        for (Integer setBNums : b) {
//        for (int i = 1; i <= setBNums; i ++) {
//            if (setBNums % i == 0)
//                System.out.println(setBNums);
//            betweeners.add(setBNums);
//        }
//    }
//
//        System.out.println(betweeners);
//        return numsBetween;
//

/////////////////// third attempt///////////////////////////////////////
//
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        // find the factors of each element in list a
//        // find the factors of each element in list b
//        // every factor num from list b that is the same as factor num in list a betweenNums++;
//        int betweenNums = 0;
//        Set<Integer> factorsB = new HashSet<>();
//        Set<Integer> factorsA = new HashSet<>();
//
//
//        for (Integer number : b) {
//            for (int i = 2; i <= number; i++) {
//                if (number % i == 0) {
//
//                    factorsB.add(i);
//                }
//
//            }
//
//        }
//        for (Integer nums : a) {
//            for (int i = 2; i <= nums; i++) {
//                if (nums % i == 0) {
//                    factorsA.add(i);
//                }
//            }
//        }
//
//        for (Integer factB : factorsB) {
//            for (Integer factA : factorsA) {
//                if (factA % factB == 0) {
//                    betweenNums++;
//                }
//            }
//        }
//
//
//        System.out.println(factorsB);
//        System.out.println(factorsA);
//        System.out.println(betweenNums);
//
//        return betweenNums;
//    }
//
//
//}
//
//
