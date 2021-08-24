class Solution {
    private List<List<Integer>> ans;
    private int n;
    private int k;
    
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        this.ans = new ArrayList<List<Integer>>();
        
        backtrack(new ArrayList<Integer>(), 1);
        return this.ans;
    }
    
    private void backtrack(List<Integer> curr, int start) {
        if (curr.size() == k) {
            this.ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for (int i = start; i <= this.n; i++) {
            curr.add(i);
            backtrack(curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}
