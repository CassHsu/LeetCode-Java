class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if (root != null) stack.push(root);
        
        while (stack.isEmpty() == false) {
            TreeNode node = stack.pop();
            
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
            ans.add(node.val);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
