ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode current = dummy;
while(current.next!=null && current.next.next != null){
ListNode first=current.next; // 2
ListNode second = current.next.next; // 3
first.next=current;
current.next= second; // 1-3
current.next.next = first;
current=current.next.next;
​
}
return dummy.next;