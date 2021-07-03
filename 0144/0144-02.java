class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if (root != null) stack.push(root);
        
        while (stack.isEmpty() == false) {
            TreeNode node = stack.pop();
            ans.add(node.val);
            
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        
        return ans;
    }
}
