package com.company.warmUps;

public class WU02CountingValleys {

    public static int countingValleys(int steps, String path) {
        int vallyCount = 0;
        int altitude = 0;

        for (int i = 0; i < steps; i++) {
            char character = path.charAt(i);
            if (character == 'U') {
                altitude++;
                if (altitude == 0) {
                    vallyCount++;
                }
            } else {
                altitude--;
            }
        }
        return vallyCount;

    }

}
