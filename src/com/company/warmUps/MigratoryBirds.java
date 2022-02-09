package com.company.warmUps;

import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> birdsSighted = new ArrayList<>();
        birdsSighted.add(1);
        birdsSighted.add(1);
        birdsSighted.add(2);
        birdsSighted.add(2);
        birdsSighted.add(3);

        migratoryBirds(birdsSighted);

    }


    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> freqOfBirds = new HashMap<>();//instantiate hashmap
        for (int i = 0; i < arr.size(); i++) {//iterate through the arr argument
//            System.out.println(birds);
//            freqOfBirds.put(arr.get(i), Collections.frequency(arr, arr.get(i)));//put each bird id and the freq sighted into the hashmap

            if (!freqOfBirds.containsKey(arr.get(i))) {
                freqOfBirds.put(arr.get(i), 1);
            }else {
                freqOfBirds.put(arr.get(i), freqOfBirds.get(arr.get(i)) + 1);
            }

//            System.out.println(freqOfBirds);

        }

        Integer mostSighted = Collections.max(freqOfBirds.values());//finds the max value in map

//        System.out.println(mostSighted);

        Map<Integer, Integer> keyOfMostSighted = new HashMap<>();
        for (Integer freq : freqOfBirds.keySet()) {//iterates through hashmap
            if (freqOfBirds.get(freq) == mostSighted) {//testing if the value of each key is equal to the max most sighted
                keyOfMostSighted.put(freq, Collections.frequency(freqOfBirds.keySet(), freqOfBirds.get(freq)));//add keys that are equal to the max to the list
                Integer minKey = Collections.min(keyOfMostSighted.keySet()); //finds min key in list
                System.out.println(minKey);
                return minKey; //returning the first index of the list ie the lowest key
            }
        }


        System.out.println(mostSighted);
        return mostSighted;

    }
}
