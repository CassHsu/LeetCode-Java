class Solution {
    private int[] nums;
    public int findMiddleIndex(int[] nums) {
        this.nums = nums;
        int len = nums.length;
        
        for (int i = 0; i < len; i++) {
            if (this.sum(0, i) == this.sum(i+1, len)) return i;
        }
        
        return -1;
    }
    
    private int sum(int start, int end) {
        int ans = 0;
        for (int i = start; i < end; i++) {
            ans += this.nums[i];
        }
        return ans;
    }
}
