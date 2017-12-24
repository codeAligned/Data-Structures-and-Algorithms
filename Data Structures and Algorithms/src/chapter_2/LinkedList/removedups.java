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
        HashMap<Integer,Integer> c_map=new HashMap(); //maintains count
 		ListNode t=head;
 		while (t!=null) {
 			c_map.put(t.val,(c_map.containsKey(t.val))?c_map.get(t.val)+1:1);
 			t=t.next;	
 		}
 		return compute(head,c_map);
     }

     ListNode compute(ListNode head,HashMap<Integer,Integer> map){
     if(head==null) return null;
     if (map.get(head.val)==1) { //spare this node,compute for next
     	head.next=compute(head.next,map);
     }else
     head=compute(head.next,map); //remove this node and check for next
     return head;
     }
}