package com.company.warmUps;

import java.util.HashMap;
import java.util.List;

public class OrganizeBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        HashMap<Integer, Integer> ballMap = new HashMap<>();

        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.get(i).size(); j++) {
                System.out.println(container.get(i).get(j));
            }

        }

        return "";

    }
}
