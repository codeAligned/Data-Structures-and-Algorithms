/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int n=0;
        ListNode head=root;
        while(head!=null){
        	n++;
        	head=head.next;
        }
        int y=n/k;
        int r=(y!=0)?n-y*k:0;
        //System.out.println("y "+y+" r "+r);
        ListNode[] res=new ListNode[k];
        int i=0;
        head=root;
        while(i<k){
        	if(head!=null) {
            res[i]=head;
        	int c=y;
        	if(r!=0) {
        		c+=1;
        		r-=1;
        	}
        	//System.out.println("c "+c);
        	while(--c>0){ // --c, decrease first because one node is already assigned 
        		head=head.next;
        		if(head==null) break;	
        	}
        	if(head!=null){
        		ListNode temp=head.next;
        		head.next=null;
        		head=temp;
        	}
        	else break;
        }
        i++;
    }
    return res;
    }
}
