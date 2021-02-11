class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int leftSize = getSize(root.left);
        if (k <= leftSize) return kthSmallest(root.left, k);
        if (k == leftSize + 1) return root.val;
        return kthSmallest(root.right, k - (leftSize + 1));
    }
    
    private int getSize(TreeNode root) {
        if (root == null) return 0;
        return getSize(root.left) + 1 + getSize(root.right);
    }
}