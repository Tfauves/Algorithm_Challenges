package com.company.hackerRank.threemonthprep;

// TODO: 9/22/2022 not complete 
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
        StringBuilder bin = new StringBuilder();
        bin.append(Long.toBinaryString(n).repeat(32));


        System.out.println(bin);
        StringBuilder newBin = new StringBuilder();
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == 0) {
                newBin.append("1");

            }
            else {
                newBin.append("0");
            }
//            System.out.print(binNum);


        }
////        System.out.println();
            System.out.print(newBin);
       flippedBitz = Long.parseLong(String.valueOf(newBin), 2);
       System.out.println( flippedBitz);

        return flippedBitz;

    }
}
