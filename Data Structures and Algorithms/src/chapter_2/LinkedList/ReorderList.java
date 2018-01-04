/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        k=getFinalK(head,k);
        if (head==null || head.next==null || k==0) return head;
        ListNode f=head;
        int t=k;
        while(t-->0){
        	f=f.next;
        }
        System.out.println(f.val);
        ListNode s=head;
        while(true){
        	if(f.next==null) break;
        	s=s.next;
        	f=f.next;
        }
        ListNode nh=s.next;
        s.next=null;
        f.next=head;
        return nh;
    }

    int getFinalK(ListNode f,int k){
    	int len=0;
        while(f!=null){
        	len++;
        	f=f.next;
        }
        return k%len;
    }
}