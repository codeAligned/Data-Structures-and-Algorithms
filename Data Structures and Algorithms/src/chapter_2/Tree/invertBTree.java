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
    public TreeNode invertTree(TreeNode root) {
     	if(root==null) return null;
     	TreeNode r=(root.left==null)?null:invertTree(root.left);
     	TreeNode l=(root.right==null)?null:invertTree(root.right);
     	root.left=r;
     	root.right=r;
     	return root;
    }
}