/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *//*

class Solution {
    public ListNode reverseList(ListNode head) {
 	if(head==null) return null;
 	return helper(null,head);	       
    }

    ListNode helper(ListNode prev,ListNode curr){
    	ListNode next=curr.next;
    	curr.next=prev;
    	if(next==null) return curr;
    	return helper(curr,next);
    }
}*/
