class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        TreeNode l = root.left;
        TreeNode r = root.right;
        
        this.flatten(root.left);
        this.flatten(root.right);
        
        root.left = null;
        root.right = l;
        
        while (root.right != null) {
            root = root.right; 
        }
        
        root.right = r;
    }
}
