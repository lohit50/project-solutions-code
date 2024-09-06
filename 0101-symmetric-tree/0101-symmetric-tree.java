class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}