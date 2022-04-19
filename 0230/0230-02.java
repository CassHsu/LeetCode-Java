class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
        return nums.get(k - 1);
    }
    
    private ArrayList<Integer> inorder(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) return arr;
        
        inorder(node.left, arr);
        arr.add(node.val);
        inorder(node.right, arr);
        return arr;
    }
}
