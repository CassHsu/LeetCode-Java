class Solution {
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private int k, n;
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        this.backtrack(new ArrayList<Integer>(), 1, n);
        
        return this.ans;
    }
    
    private void backtrack(List<Integer> curr, int start, int remain) {
        if (remain == 0 && curr.size() == this.k) {
            this.ans.add(new ArrayList<Integer>(curr));
            return;
            
        } else if (remain < 0 || curr.size() == this.k) {
            return;
        }
        
        for (int i = start; i <= 9; i++) {
            curr.add(i);
            this.backtrack(curr, i + 1, remain - i);
            curr.remove(curr.size() - 1);
        }
    }
}
