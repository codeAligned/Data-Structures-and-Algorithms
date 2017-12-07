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
    	if(head==null) return null;
 	int count=1;
 	ListNode arr[]=new ListNode[2];
 	arr[0]=new ListNode(-1);
 	arr[1]=new ListNode(-1);
 	ListNode odd=arr[1];
 	ListNode eve=arr[0];
 	while(head!=null){
 		int ind=count++%2;
 		arr[ind].val=head.val;	
 		arr[ind].next=new ListNode(-1);
 		arr[ind]=arr[ind].next;
 		head=head.next;
 	}
/* 	ListNode a=odd;
 	while(a!=null){
 		System.out.println(a.val);
 		a=a.next;
 	}
 	a=eve;
 	while(a!=null){
 		System.out.println(a.val);
 		a=a.next;
 	}*/
 	while(true){
 		arr[1].val=eve.val;
 		eve=eve.next;
 		if(eve!=null && eve.val!=-1){
 		arr[1].next=new ListNode(-1);
 		arr[1]=arr[1].next;	
 		}else{
 			break;
 		}
 	}
 	return odd;
 	}


}
