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
        ListNode resulting=l1;
        while(l1.next!=null && l2.next!=null){
        	resulting.next=merge(resulting,l1,l2);
        	l1=l1.next;
        	l2=l2.next;
        }
        if(l1.next==null) resulting.next=l2;
        if(l2.next==null) resulting.next=l1;
        return resulting;
    }
}