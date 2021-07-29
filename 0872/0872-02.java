class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return dfs(root1).equals(dfs(root2));
    }
    
    private String dfs(TreeNode node) {
        if (node.left == null && node.right == null) return String.valueOf(node.val);
        
        List<String> ret = new ArrayList<String>();
        if (node.left != null) {
            ret.add(dfs(node.left));
        }
        
        if (node.right != null) {
            ret.add(dfs(node.right));
        }
        
        return String.join("-", ret);
    }
}
