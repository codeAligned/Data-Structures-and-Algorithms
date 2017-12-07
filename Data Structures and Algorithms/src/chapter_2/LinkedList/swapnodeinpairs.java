/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
 	if(head==null || head.next==null) return head;
 	head.next.next=swapPairs(head.next.next);
 	ListNode swap=head.next;
 	head.next=swap.next;
 	swap.next=head;
 	return swap;
    }
}