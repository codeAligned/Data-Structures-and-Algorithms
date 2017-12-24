/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if(head==null || head.next==null) return head;
 		ListNode odd;
 		odd=copy(head);
 		ListNode t=odd;
 		traverse(t).next=copy(head.next);
 		return odd;
 	}

 	// O(n)
 	ListNode traverse(ListNode n){
 		while(n.next!=null){
 			n=n.next;
 		}
 		return n;
 	}


 	// O(n)
 	ListNode copy(ListNode node){
 		ListNode head=new ListNode(-1);
 		ListNode res=head;
 		while (true) {
 				if(node!=null){
 					ListNode ins=new ListNode(node.val); //malloc
 					res.next=ins; 
 					res=res.next;
 				}else break;
 				node=next(next(node)); 
 		}
 		return head.next;
 	}

 	ListNode next(ListNode move){
 		return (move==null)?move:move.next;
 	}


}
