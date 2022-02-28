package com.company.classWork.node;

public class Node<T> {
    public T value;
    public Node<T> next;
//    public Node<T> prev;

    public Node(T value) {
        this.value = value;
    }

//    public Node(T value, Node<T> parent) {
//        this.value = value;
//        prev = parent;
//    }
}
