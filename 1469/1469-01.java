class Solution {
    private ArrayList<Integer> ans = null;
    public List<Integer> getLonelyNodes(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root);
        
        return ans;
    }
    
    private void dfs(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right != null) ans.add(node.right.val);
        if (node.left != null && node.right == null) ans.add(node.left.val);
        
        dfs(node.left);
        dfs(node.right);
    }
}
