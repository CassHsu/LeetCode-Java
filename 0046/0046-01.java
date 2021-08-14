class Solution {
    private int[] nums;
    private List<List<Integer>> ans;
    
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.ans = new ArrayList<>();
        
        backtrack(new ArrayList<>());
        return this.ans;
    }
    
    private void backtrack(List<Integer> curr) {
        if (nums.length == curr.size()) {
            this.ans.add(new ArrayList(curr));
            return;
        }
        
        for (int n: nums) {
            if (curr.contains(n)) continue;
            
            curr.add(n);
            backtrack(curr);
            curr.remove(curr.size() - 1);
        }
        
        return;
    }
}
