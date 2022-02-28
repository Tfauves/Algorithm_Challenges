package com.company.hackerRank;
//c[(i + k) %n]
//if c[i] = 0 then i is cumulus and e = -1
//if c[i] = 1 then i is thunderhead and e = -1 for the jump + additional -2



public class JumpingCloudsRev {
    public static void main(String[] args) {
//        1, 1, 1, 0, 1, 1, 0, 0, 0, 0
//        int[] clouds = new int[] {0, 0, 1, 0, 0, 1, 1, 0};
        int[] clouds = new int[] {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};

        jumpingOnClouds(clouds, 3);
    }

    static int jumpingOnClouds(int[] clouds, int jumpDistance) {
        int energy = 100;
        int cloud = 0;

        do {
            cloud = (cloud + jumpDistance) % clouds.length;

            if (clouds[cloud] != 0) {
                energy -= 2;
            }
            energy -= 1;


        }while(cloud != 0);
        System.out.println(energy);
        return energy;

    }

//    static int jumpingOnClouds(int[] clouds, int jumpDistance) {
//        int energy = 100;
//        for (int i = 0; i < clouds.length; i += jumpDistance) {
//            int cloudType = clouds[i];
//
//            if (cloudType != 0) {
//                energy -= 2;
//            }
//            energy -= 1;
//        }
//
//        System.out.println(energy);
//
//        return energy;
//
//    }
}
