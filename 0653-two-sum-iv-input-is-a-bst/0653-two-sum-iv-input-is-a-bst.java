/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> hs = new HashSet<Integer>();
        return checkpair(root,k,hs);
        
    }
    public boolean checkpair(TreeNode root,int k,HashSet<Integer> hs)
    {
        if(root == null)
        {
            return false;
        }
        if(hs.contains(k - root.val))
        {
            return true;
        }
        hs.add(root.val);
        return false || checkpair(root.left,k,hs) || checkpair(root.right,k,hs);
    }
}