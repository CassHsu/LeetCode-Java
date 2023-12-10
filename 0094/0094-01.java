class Solution {
    private List<Integer> ans;

    public List<Integer> inorderTraversal(TreeNode root) {
        this.ans = new ArrayList<Integer>();

        this.dfs(root);
        return this.ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        this.dfs(node.left);
        this.ans.add(node.val);
        this.dfs(node.right);
    }
}
