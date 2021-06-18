class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> ret = new ArrayList<>();
        
        dfs(root, 0, ret, count);
        
        for (int i = 0; i < ret.size(); i++) {
            ret.set(i, ret.get(i) / count.get(i));
        }
        
        return ret;
    }
    
    private void dfs(TreeNode t, int i, List<Double> sum, List<Integer> count) {
        if (t == null) return;
        
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + t.val);
            count.set(i, count.get(i) + 1);
        } else {
            sum.add(1.0 * t.val);
            count.add(1);
        }
        
        dfs(t.left, i+1, sum, count);
        dfs(t.right, i+1, sum, count);
    }
}
