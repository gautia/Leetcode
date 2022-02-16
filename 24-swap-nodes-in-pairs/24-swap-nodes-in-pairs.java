/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         ListNode node = new ListNode(0);
         node.next = head;
    ListNode current = node;
    while (current.next != null && current.next.next != null) {
      
        ListNode first = current.next; // 2
        ListNode second = current.next.next; // 3
        
        first.next = second.next;
        current.next = second;
        current.next.next = first;
        current = current.next.next;
    }
    return node.next;
    }
}