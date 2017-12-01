/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;  
        ListNode copy=createCopy(head);
 		ListNode head1=reverse(null,copy);
 		while(head!=null && head1!=null){}
 			if(head1.val!=head.val) return false;
  			head=head.next;
  			head1=head1.next;	
  		}
  		return true;
    }  

    ListNode createCopy(ListNode node){
    	ListNode head1=new ListNode(node.val);
    	ListNode copy=head1;
    	while(node.next!=null){
    		node=node.next;
    		ListNode nextref=new ListNode(node.val);
    		copy.next=nextref;
    		copy=copy.next;
    	}
    	return head1;
    }

    ListNode reverse(ListNode prev,ListNode curr){
    	ListNode next=curr.next;
    	curr.next=prev;
    	if(next==null) return curr;
    	return reverse(curr,next);
    }
}