package com.company.classWork.node;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);

        displayList(head);//2859
        displayList(find(head, 5));//59
        displayList(find(head, 8));//859
        head = remove(head, 5);//nothing
        displayList(head);//289
        head = remove(head, 2);
        displayList(head);//89
        addNode(head, 42);
        displayList(head);// 8, 9, 42


    }



    //returns the head of the node
    public static Node<Integer> addNode(Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<Integer>(value);
        if (head == null) {
            return newNode;
        }
        Node<Integer> trav = head;

        while(trav.next != null) {
            trav = trav.next;
        }
        //trav is at the end of the list
        trav.next = newNode;
        return head;
    }

    public static Node<Integer> recAddNode(Node<Integer> head, int value) {
        if (head == null) {
            return new Node<Integer>(value);
        }
        head.next = recAddNode(head.next, value);
        return head;
    }


    public static void displayList(Node<Integer> head) {
        Node<Integer> current = head;
        StringBuilder outPut = new StringBuilder();

        while(current != null) {
            outPut.append(current.value);
             if(current.next != null) {
                 outPut.append(", ");
             }
             current = current.next;
        }
        System.out.println(outPut);
    }

    public static Node<Integer> find(Node<Integer> head, int query) {
        Node<Integer> current = head;

        while(current != null && current.value != query) {

            current = current.next;
        }
        return current;
    }

    public static Node<Integer> remove(Node<Integer> head, int query) {
        if (head.value == query) {
            head = head.next;
            return head;
        }
        Node<Integer> current = head;

        while (current.next != null && current.next.value != query) {
            current = current.next;

        }

        current.next = current.next.next;
        return head;
    }

    public static void assertResult(boolean result) {
        if (result) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
