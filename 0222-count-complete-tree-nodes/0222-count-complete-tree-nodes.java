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
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       ArrayList<TreeNode> a = new ArrayList<>();
       a.add(root);
       while(q.size()>0){
           TreeNode curr = q.remove();
           if(curr.right!=null){
               q.add(curr.right);
               a.add(curr.right);
           }
           if (curr.left!=null){
               q.add(curr.left);
               a.add(curr.left);
           }
       }
       return a.size();
        
    }
}