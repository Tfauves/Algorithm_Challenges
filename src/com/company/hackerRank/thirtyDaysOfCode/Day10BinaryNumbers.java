package com.company.hackerRank.thirtyDaysOfCode;

//public class Day10BinaryNumbers {
//
//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//            String bin = Integer.toBinaryString(n);
//
//            int currentConsecutiveOnes = 0;
//            int maxConsecutiveOnes = 0;
//            for (char digit : bin.toCharArray()) {
//                if (digit == '1') {
//                    currentConsecutiveOnes++;
//                } else {
//                    if (currentConsecutiveOnes > maxConsecutiveOnes) {
//                        maxConsecutiveOnes = currentConsecutiveOnes;
//                    }
//                    currentConsecutiveOnes = 0;
//                }
//            }
//            if (currentConsecutiveOnes > maxConsecutiveOnes) {
//                maxConsecutiveOnes = currentConsecutiveOnes;
//            }
//
//            System.out.println(maxConsecutiveOnes);
//
//
//            bufferedReader.close();
//        }
//    }
//
//}
