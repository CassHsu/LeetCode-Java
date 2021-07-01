class Solution {
    private List<Integer> ret = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ret;
    }
    
    private void preorder(TreeNode node) {
        if (node == null) return;
        
        ret.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
