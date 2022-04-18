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
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer> list = traverse(root,new ArrayList<>());
        
        Collections.sort(list);
        System.out.println(list);
        int ans = list.get(k-1);
        return ans;

        
    }
    
    public ArrayList<Integer> traverse(TreeNode root, ArrayList<Integer> list){
        
        if(root == null)
        return list;
        
        
            list.add(root.val);
            traverse(root.left,list);
            traverse(root.right,list);
        return list;
    }
}