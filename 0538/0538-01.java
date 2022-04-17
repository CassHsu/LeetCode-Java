class Solution {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }
    
    int dfs(TreeNode node, int total) {
        if (node == null) return total;
        
        node.val += dfs(node.right, total);
        return dfs(node.left, node.val);
    }
}
