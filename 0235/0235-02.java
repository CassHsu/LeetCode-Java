class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode n = root;
        int pv = p.val;
        int qv = q.val;
        
        while (n != null) {
            int pav = n.val;
            
            if (pv > pav && qv > pav) n = n.right;
            else if (pv < pav && qv < pav) n = n.left;
            else return n;
        }
        return null;
    }
}
