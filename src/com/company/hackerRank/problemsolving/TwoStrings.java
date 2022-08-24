package com.company.hackerRank.problemsolving;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "hackerrankcommunity";
        String s2 = "cdecdecdecde";

        twoStrings(s1, s2);

    }

    // fails 2 cases, time complexity??
    public static String twoStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
//          System.out.println(s1.substring(i, i+1));
            if (s2.contains(s1.substring(i, i+1))){
                System.out.println("YES");
                return "YES";
            }
        }

        return "NO";
    }

    // TODO: 6/1/2022 first and second attempts
//    public static String twoStrings(String s1, String s2) {
////        boolean containsSubs = false;
////        List<String> subStrings = new ArrayList<>();
////        strings.add(s1);
////        strings.add(s2);
//
//        for (int i = 0; i < s1.length(); i++) {
//            for (int j = i + 1; j <= s1.length(); j++) {
////                subStrings.add(s1.substring(i, j));
////                System.out.println(s1.substring(i, j));
//                if (s2.contains(s1.substring(i, j))){
//                    System.out.println("YES");
//                    return "YES";
//                }
//            }
//        }
////        for (String words : subStrings) {
////            if (s2.contains(words)) {
////                containsSubs = true;
////                break;
////            }
////        }
////        if (containsSubs) {
////            System.out.println("Yes");
////            return "Yes";
////        }
//
////        System.out.println(subStrings);
//
//        System.out.println("No");
//        return "NO";
//
//    }

}