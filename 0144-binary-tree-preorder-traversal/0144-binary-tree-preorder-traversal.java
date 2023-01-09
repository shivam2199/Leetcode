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
    ArrayList<Integer> a = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root!=null)
            a.add(root.val);
        else
            return a;
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return a;
    }
}