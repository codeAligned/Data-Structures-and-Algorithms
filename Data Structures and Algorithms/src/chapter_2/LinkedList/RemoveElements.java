/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    	if(head==null) return null;
    	ListNode sudo=new ListNode(-1);
    	sudo.next=head;
    	ListNode copy=sudo;
    	while(sudo!=null){
    		if(sudo.next.val==val){
    			if(sudo.next.next!=null)
    			sudo.next=sudo.next.next;
    		else sudo.next=null;
    		}
    		sudo=sudo.next;
    	}	

    	return copy.next;
   }
}