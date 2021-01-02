class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode root, int count) {
        if (root == null) return count;
        
        count++;
        int l = dfs(root.left, count);
        int r = dfs(root.right, count);
        
        return Math.max(l, r);
    }
}