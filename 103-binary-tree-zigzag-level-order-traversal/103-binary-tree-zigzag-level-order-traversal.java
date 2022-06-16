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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) 
            return res;
        
        Queue<TreeNode> q = new LinkedList<>(); 
        q.add(root);
        
        boolean zigzag = true;
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = q.size();
            
            for(int i = 0; i < count; i++){
                TreeNode node = q.poll();
                if(zigzag){
                    list.add(node.val);
                }else{
                    list.add(0, node.val);
                }
                
                if(node.left != null){
                    q.add(node.left);
                }
                
                if(node.right != null){
                    q.add(node.right);
                }
            }
            
            zigzag = !zigzag;
            res.add(list);
        }
        
        return res;
    }
}


























/*
List<List<Integer>> res = new ArrayList<>();
if (root == null) return res;
Queue<TreeNode> queue = new LinkedList<>();
queue.add(root);
boolean zigzag = false;
while (!queue.isEmpty()) {
    List<Integer> level = new ArrayList<>();
    int cnt = queue.size();
    for (int i = 0; i < cnt; i++) {
        TreeNode node = queue.poll();
        if (zigzag) {
            level.add(0, node.val);
        }
        else {
            level.add(node.val);
        }
        if (node.left != null) {
            queue.add(node.left);
        }
        if (node.right != null) {
            queue.add(node.right);
        }
    }
    res.add(level);
    zigzag = !zigzag;
}
return res;*/