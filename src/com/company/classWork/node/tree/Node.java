package com.company.classWork.node.tree;

public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> right;
//    public Node<T> prev;

    public Node(T value) {
        this.value = value;
    }

//    public Node(T value, Node<T> parent) {
//        this.value = value;
//        prev = parent;
//    }
}
