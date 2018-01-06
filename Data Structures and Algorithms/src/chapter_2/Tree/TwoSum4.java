/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
    	HashSet<Integer> map=new HashSet(); // map will contain the required counterparts.
    	return findTarget(root,k,map);
    }

    boolean findTarget(TreeNode node,int t,HashSet<Integer> map){
    	if(node==null) return false;
    	if(map.contains(node.val)) return true;
    	map.add(t-node.val); // t-node.val is the required number to make t.
    	boolean l=findTarget(node.left,t,map);
    	boolean r=findTarget(node.right,t,map);
    	return (l || r);
    }
}