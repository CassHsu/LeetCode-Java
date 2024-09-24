class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    private void inorderHelper(TreeNode node, List<Integer> res) {
        if (node != null) {
            inorderHelper(node.left, res);
            res.add(node.val);
            inorderHelper(node.right, res);
        }
    }
}
