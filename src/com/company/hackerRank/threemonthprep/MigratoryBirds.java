package com.company.hackerRank.threemonthprep;
import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> freqOfBirds = new HashMap<>();
        for (Integer integer : arr) {
            if (!freqOfBirds.containsKey(integer)) {
                freqOfBirds.put(integer, 1);
            } else {
                freqOfBirds.put(integer, freqOfBirds.get(integer) + 1);
            }
        }
        Integer mostSighted = Collections.max(freqOfBirds.values());

        Map<Integer, Integer> keyOfMostSighted = new HashMap<>();
        for (Integer freq : freqOfBirds.keySet()) {
            if (Objects.equals(freqOfBirds.get(freq), mostSighted)) {
                keyOfMostSighted.put(freq, Collections.frequency(freqOfBirds.keySet(), freqOfBirds.get(freq)));
                Integer minKey = Collections.min(keyOfMostSighted.keySet());
//                System.out.println(minKey);
                return minKey;
            }
        }
//        System.out.println(mostSighted);
        return mostSighted;
    }
}
