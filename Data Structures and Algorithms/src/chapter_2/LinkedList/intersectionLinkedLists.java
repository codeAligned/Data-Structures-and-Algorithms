/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
 	int sa=0;
 	int sb=0;
 	ListNode traverse=headA;
 	while(traverse!=null){
 		traverse=traverse.next;
 		sa++;
 	}
 	traverse=headB;
 	while(traverse!=null){
 		traverse=traverse.next;
 		sb++;
 	}
 	if(sa<sb){
 		while(sb--!=sa && headB!=null){
 			headB=headB.next;
 		}
 	}else if(sb<sa){
 		while(sa--!=sb && headA!=null){
 			headA=headA.next;
 		}
 	}
 	while(headA!=null && headB!=null){
 		if(headA==headB) {
 		return headA;
 		}
 		headA=headA.next;
 		headB=headB.next;
 	}
 	return null;       
    }
}