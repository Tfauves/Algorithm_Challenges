package com.company.codeSingnal;

//public class RemoveKFromList {
//
//    ListNode<Integer> solution(ListNode<Integer> l, int k) {
//    /*
//    find k and remove it from the list:
//    k = the first element?
//    k = the last element?
//    k = the middle or spead out through the list?
//    */
//
//        if (l == null) {//if the list is empty return the empty list
//            return l;
//        }
//
//        while (l.value == k && l != null) {//while the first node is = to k and we are not at the end of the list point to the next in line until the end(null)
//            l = l.next;
//            if (l == null) {
//                break;
//            }
//        }
//
//        if (l == null) {//check to see if the list is empty after breaking from loop
//            return l;
//        }
//
//        ListNode current = l;//set a temp node to the hold copy of list
//
//        while (current.next != null) { //while current pointer is not pointing at null(end of list) run code block
//            if ((int)current.next.value == k) { //if the value of the current pointer is = k set the current pointer to the pointer of the next pointer
//                current.next = current.next.next;
//            } else {
//                current = current.next;//else current moves to the next node
//            }
//        }
//
//        return l;
//    }
//
//
//}
