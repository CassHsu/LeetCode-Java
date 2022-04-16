class Solution {
    int low;
    int high;
    
    public TreeNode trimBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        return trim(root);
    }
    
    private TreeNode trim(TreeNode node) {
        if (node == null) return null;
        else if (node.val > high) {
            return trim(node.left);
        } else if (node.val < low) {
            return trim(node.right);
        } else {
            node.left = trim(node.left);
            node.right = trim(node.right);
            return node;
        }
    }
}
