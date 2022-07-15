class Solution {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderIndexMap;
    private int[] preorder;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorderIndexMap = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        
        return arrayToTree(0, preorder.length - 1);
    }
    
    private TreeNode arrayToTree(int l, int r) {
        if (l > r) return null;
        
        int rootVal = this.preorder[this.preorderIndex];
        this.preorderIndex++;
        TreeNode root = new TreeNode(rootVal);
        
        root.left = this.arrayToTree(l, this.inorderIndexMap.get(rootVal) - 1);
        root.right = this.arrayToTree(this.inorderIndexMap.get(rootVal) + 1, r);
        return root;
    }
}
