package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {

        int[] input = {1,2,2,1,3};
        System.out.println(uniqueOccurrences(input));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        Set<Integer> occurenceCounts = new HashSet<>();

        for (Integer num : arr) {
            if (!occurenceMap.containsKey(num)) {
                occurenceMap.put(num, 1);
            } else {
                occurenceMap.put(num, occurenceMap.get(num) + 1);
            }
        }

        for (Integer count : occurenceMap.values()) {
            if (!occurenceCounts.add(count)) {
                return false;
            }
        }

        return true;
    }

}
