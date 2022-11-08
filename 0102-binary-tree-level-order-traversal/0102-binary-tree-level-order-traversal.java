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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList <>();
        if (root == null)
            return l;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int ln = q.size();
            List<Integer> c = new ArrayList<>();
            int i;
            for (i=0;i<ln;i++){
                TreeNode cu = q.remove();
                c.add(cu.val);
                if (cu.left!= null)
                    q.add(cu.left);
                if (cu.right!=null)
                    q.add(cu.right);
            }
            l.add(c);
        }
        return l;
    }
}