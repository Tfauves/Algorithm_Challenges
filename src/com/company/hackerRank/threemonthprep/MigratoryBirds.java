package com.company.hackerRank.threemonthprep;
// TODO: 10/6/2022 needs more work, passing 1 test so far 
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static void main(String[] args) {
        
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdMap = new HashMap<>();
        int birds = 0;
        for (Integer birdsSeen : arr) {
            if (!birdMap.containsKey(birdsSeen)) {
                birdMap.put(birdsSeen, 1);
            } else {
                birdMap.put(birdsSeen, birdMap.get(birdsSeen) +1);
            }
        }

        birds = Collections.max(birdMap.values());

        System.out.println(birdMap);
        System.out.println(birds);
        return birds;
    }


}
