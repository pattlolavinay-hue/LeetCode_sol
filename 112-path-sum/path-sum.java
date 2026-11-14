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
    public static boolean CheckSum(TreeNode root, int totsum, int sum){
        if(root==null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right==null){
            return sum == totsum;
        }
        return CheckSum(root.left,totsum,sum)||CheckSum(root.right,totsum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return CheckSum(root,targetSum,0);
    }
}