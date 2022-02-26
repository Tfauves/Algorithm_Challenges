package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
//add node class internally as it is an implementation detail of the linked list no we access to its private fields without a setter
    private class Node {
        private int value;
        private Node next;

        //node class constructor
        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;


    public void addLast(int item) {
        //wrap the item in a node obj
        Node node = new Node(item);
// check if list is empty
        if (isEmpty()) {
            first = node;
            last = node;

        }else {
            //this case is if the list has at least one node
            //linking the last node to new node
            last.next = node;
            //last now points to the new node.
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;

        } else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean containsItem(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;

    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node find(int node) {
        Node current = first;
        if (first == null) {
            return null;
        }

        while (current != null) {
            current = current.next;

            if (current.value == node) {
                return current;
            }


        }

        return current;
    }

}
