package com.company.leetcode;

import java.util.LinkedList;

public class DesignHashSet {

    public static void main(String[] args) {



    }

    class MyHashSet {
        private static final int DEFAULT_CAPACITY = 16;
        private LinkedList<Integer>[] buckets;
        private int capacity;

        public MyHashSet() {
            this(DEFAULT_CAPACITY);
        }

        public MyHashSet(int capacity) {
            this.capacity = capacity;
            this.buckets = new LinkedList[capacity];
            for (int i = 0; i < capacity; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(int key) {
            return key % capacity;
        }

        public void add(int key) {
            int index = hashFunction(key);
            LinkedList<Integer> bucket = buckets[index];
            if (!bucket.contains(key)) {
                bucket.add(key);
            }
        }

        public void remove(int key) {
            int index = hashFunction(key);
            LinkedList<Integer> bucket = buckets[index];
            bucket.remove(Integer.valueOf(key));
        }

        public boolean contains(int key) {
            int index = hashFunction(key);
            LinkedList<Integer> bucket = buckets[index];
            return bucket.contains(key);
        }
    }

}
