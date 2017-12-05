/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=new ListNode((l1.val<l2.val)?l1.val:l2.val);
		head.next=(l1.val<l2.val)?mergeTwoLists(l1.next,l2):mergeTwoLists(l1,l2.next);        
        return head;
    }
}