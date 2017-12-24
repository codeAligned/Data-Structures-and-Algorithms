/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
 	if(head==null || head.next==null) return head;
 	ListNode sorted=new ListNode(head.val);
 	head=head.next;
 	while(head!=null){
 	ListNode i=new ListNode(head.val);	
 	ListNode t=sorted;
 	ListNode temp=i;
 	while(t.val>i.val){
 		
 	}
 	}

 	}
 	}
}