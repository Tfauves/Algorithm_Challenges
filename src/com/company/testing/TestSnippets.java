package com.company.testing;

import java.util.ArrayList;
import java.util.List;

public class TestSnippets {
    public static void main(String[] args) {
        Acquaintance hhhh = new Acquaintance("jasper");
        hhhh.getStatus();
        Friend fre = new Friend("dog", "dogtown");
fre.getStatus();


//     List<Integer> test = new ArrayList<>();
//        test.add(9);
//        test.add(5);
//        test.add(6);
//        test.add(10);
//        test.add(9);
//        test.add(10);
//        test.add(9);
//        test.add(9);
//        test.add(7);
//
////        test.add(3);
////        test.add(5);
////        test.add(4);
////        test.add(5);
////        test.add(2);
////        test.add(10);
////        testThis(test);
//
//        SerialMultiplier testrrrr = new SerialMultiplier(8, 7, 2, 7);

    }

//    public static int testThis(List<Integer> arr) {
//        int lowestIndex = 1;
//        int expoTotalMax = 0;
//
//        for (int i = 1; i < arr.size(); i++) {
//           int expoTotal = (int)Math.pow(arr.get(i -1), arr.get(i));
//
//            if (expoTotal > expoTotalMax) {
//                expoTotalMax = expoTotal;
//                    lowestIndex = i;
//            }
//
//        }
//
//        System.out.println(lowestIndex);
//        return lowestIndex;
//    }
//
//    static class SerialMultiplier {
//        int first = 1;
//        int second = 1;
//        int third = 1;
//        int fourth =1;
//        int fifth = 1;
//
//        public SerialMultiplier() {
//
//        }
//
//
//        public SerialMultiplier(int first, int second, int third, int fourth, int fifth) {
//            int result = first * second * third * fourth * fifth;
//            this.first = first;
//            this.second = second;
//            this.third = third;
//            this.fourth = fourth;
//            this.fifth = fifth;
//            System.out.println(result);
//        }
//
//        public SerialMultiplier(int first, int second, int third, int fourth) {
//            int result = first * second * third * fourth;
//            this.first = first;
//            this.second = second;
//            this.third = third;
//            this.fourth = fourth;
//
//            System.out.println(result);
//        }
//
//        public SerialMultiplier(int first, int second, int third) {
//            int result = first * second * third;
//            this.first = first;
//            this.second = second;
//            this.third = third;
//
//            System.out.println(result);
//        }
//
//        public SerialMultiplier(int first, int second) {
//            int result = first * second;
//            this.first = first;
//            this.second = second;
//
//            System.out.println(result);
//        }
//
//
//    }
}
