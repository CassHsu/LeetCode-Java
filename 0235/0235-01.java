class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pav = root.val;
        int pv = p.val;
        int qv = q.val;
        
        if (pv > pav && qv > pav) return lowestCommonAncestor(root.right, p, q);
        else if (pv < pav && qv < pav) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }
}
