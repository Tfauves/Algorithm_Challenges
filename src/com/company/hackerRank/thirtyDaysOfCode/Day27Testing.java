package com.company.hackerRank.thirtyDaysOfCode;

public class Day27Testing {

    static class TestDataEmptyArray {

        public static int[] get_array() {
            int[] testArr = {};
            return testArr;
        }
    }

    static class TestDataUniqueValues {
        private static int[] testArr = {1, 2};

        public static int[] get_array() {
            return testArr;
        }

        public static int get_expected_result() {
            int minIndex = 0;
            for (int i = 0; i < testArr.length; i++) {
                if (testArr[i] < testArr[minIndex]) minIndex = 1;
            }
            return minIndex;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] testArr = {1, 1};

        public static int[] get_array() {
            return testArr;
        }

        public static int get_expected_result() {
            int minIndex = 0;
            for (int j : testArr) {
                if (j < testArr[minIndex]) {
                    minIndex = 1;
                    break;
                }
            }
            return minIndex;
        }
    }
}
