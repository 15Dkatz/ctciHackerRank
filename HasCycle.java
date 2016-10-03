// package ctciHackerrank;
//
/// *
// Detect a cycle in a linked list. Note that the head pointer may be 'null' if
// the list is empty.
//
// A Node is defined as:
// class Node {
// int data;
// Node next;
// }
// */
//
// public class HasCycle {
// boolean hasCycle(Node head) {
// int limit = 0;
// while (head != null) {
// limit++;
// // arbitrary limit provided by hackerrank
// if (limit > 100) {
// return true;
// }
// head = head.next;
// }
// return false;
// }
// }
