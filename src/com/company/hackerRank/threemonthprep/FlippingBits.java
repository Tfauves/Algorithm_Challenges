package com.company.hackerRank.threemonthprep;

public class FlippingBits {

    public static void main(String[] args) {
        flippingBits(1);

    }

    public static long flippingBits(long n) {
        // take the long input
        // turn it to a binary
        // flip the bits
        // convert back to long
        // return that long
        Long flippedBitz = 0l;
        String bin = Long.toBinaryString(n);
       System.out.println(bin);
        StringBuilder newBin = new StringBuilder();
        for (Character binNum : bin.toCharArray()) {
            if (binNum == '0') {
                newBin.append("1");

            }
            else {
                newBin.append("0");
            }
//            System.out.print(binNum);


        }
//        System.out.println();
//        System.out.print(newBin);
        flippedBitz = Long.parseLong(String.valueOf(newBin), 2);
//        System.out.println();
//        System.out.println(number);

        return flippedBitz;

    }
}
