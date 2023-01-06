package com.company.leetcode;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String test = "1.1.1.1";

        defangIPaddr(test);

    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
