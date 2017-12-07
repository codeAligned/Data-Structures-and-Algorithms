/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    int count=0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
 	if(head==null) return null;
 	head.next=removeNthFromEnd(head.next,n);
 	count+=1;
 	if(count==n){
 		System.out.println("deleting "+head.val);
 		return head.next;
 	}
 	return head;
    }

}