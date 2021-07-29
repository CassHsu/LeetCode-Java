class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return dfs(root1).equals(dfs(root2));
    }
    
    private String dfs(TreeNode node) {
        if (node.left == null && node.right == null) return String.valueOf(node.val);
        
        String v = null;
        StringBuilder sb = new StringBuilder();
        if (node.left != null) {
            v = dfs(node.left);
            
            if ("".equals(sb.toString())) {
                sb.append(v);
            } else {
                sb.append("-");
                sb.append(v);
            }
        }
        
        if (node.right != null) {
            v = dfs(node.right);
            
            if ("".equals(sb.toString())) {
                sb.append(v);
            } else {
                sb.append("-");
                sb.append(v);
            }
        }
        
        return sb.toString();
    }
}
