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
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        if(root == null) return res;
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = q.size();
            
            for(int i = 0; i < count; i++){
                TreeNode node = q.poll();
                
                if(node.left != null)
                    q.add(node.left);
                
                if(node.right != null)
                    q.add(node.right);

                list.add(node.val);
            }
            
            res.add(list);
        }
        
        return res;
    }
}