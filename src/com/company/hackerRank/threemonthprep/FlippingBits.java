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
        long flippedBits;

        String binStr = Long.toBinaryString(n);
        String padding = String.format("%32s", binStr ).replace(' ', '0');
        System.out.println(padding);


        StringBuilder newBin = new StringBuilder();

        for (Character c : padding.toCharArray()) {
            if (c == '0') {
                newBin.append("1");
            } else {
                newBin.append("0");
            }
        }

        System.out.print(newBin);
        flippedBits = Long.parseLong(String.valueOf(newBin), 2);

        System.out.println("\n" + flippedBits);

        return flippedBits;

    }
}
