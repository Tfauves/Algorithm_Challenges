package com.company.codeSingnal;

//public class MergeTwoLinkedLists {
//
//    ListNode<Integer> solution(ListNode<Integer> head1, ListNode<Integer> head2) {
///*
//traverse list 1 to end
//point tail of list 1 to the head of list 2
//traverse merged list looking at the value of each node
//compare the values if first is > than the next swap values. If first is less than move first to first next and compare to next next.
//*/
//        ListNode trav1 = head1;
//
//
//        if (head1 == null) {
//            return head2;
//        }
//
//        while (trav1.next != null) {
//            trav1 = trav1.next;
//        }
//
//        trav1.next = head2;
//
//// ListNode current = head1;
//
//
//// while (current.next != null) {
////    current = current.next;
//
//// }
//        ListNode current = head1, index = null;
//        int temp;
//
//        while (current != null) {
//            index = current.next;
//            while (index != null) {
//// If current node's value is greater
//// than index's node value, swap the value
//                if ((int)current.value > (int)index.value) {
//                    temp = (int)current.value;
//                    current.value = index.value;
//                    index.value = temp;
//                }
//                index = index.next;
//            }
//            current = current.next;
//        }
//        return head1;
//    }
//
//
//
//}
