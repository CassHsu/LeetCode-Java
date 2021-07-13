class Solution {
    private List<Integer> ret = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return ret;
    }
    
    private void postorder(TreeNode node) {
        if (node == null) return;
        
        postorder(node.left);
        postorder(node.right);
        ret.add(node.val);
    }
}
