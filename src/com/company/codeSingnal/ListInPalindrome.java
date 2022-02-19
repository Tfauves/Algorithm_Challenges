package com.company.codeSingnal;

//public class ListInPalindrome {
// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
//    boolean solution(ListNode<Integer> head) {
//    /*
//    first and last values must be identical?
//    if the list in reverse == list then true?
//    if list is size of 1 return true
//    if list empty return true
//    */
//        List<Integer> newList1 = new ArrayList<>();
//        List<Integer> newList2 = new ArrayList<>();
//        ListNode previous = null;
//        ListNode current = head;
//        // System.out.println(head.value);
//
//        while (current != null) {
//            ListNode next = current.next;
//            newList1.add((int)current.value);
//            current.next = previous;
//            previous = current;
//
//            current = next;
//        }
//
//
//
//        while (previous != null) {
//            newList2.add((int)previous.value);
//            previous = previous.next;
//        }
//
//
//
//        if (!newList1.equals(newList2)) {
//            return false;
//
//        }
//
//
//        return true;
//    }
//}