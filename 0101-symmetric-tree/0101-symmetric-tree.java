class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean ans= isSameTree(root.left, root.right);
        return ans;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == q;
        }
        return (p.val == q.val) && isSameTree(p.left , q.right) && isSameTree(p.right, q.left); 
        
    }
    
}