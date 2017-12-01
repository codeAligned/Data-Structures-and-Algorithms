/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
 		if(head==null) return null;
 		ListNode node=head;
 		while(node.next!=null){
 			if(node.val==node.next.val){
                ListNode skip=node.next.next; // move to the node after next node
 				node.next=null; // remove the next node
 				node.next=skip; // node is current node
 			}
 			else{
 				node=node.next;
 			}
 		}     
 		return head;  
    }
}