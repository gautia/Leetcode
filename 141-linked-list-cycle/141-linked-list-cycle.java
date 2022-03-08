/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node=head;
        ArrayList<ListNode> hs = new ArrayList<ListNode>();
        while(node!=null){
            if(!hs.contains(node))
                hs.add(node);
            else
                return true;
            node=node.next;
        }
        return false;
    }
}