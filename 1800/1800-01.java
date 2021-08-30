class Solution {
    public int maxAscendingSum(int[] nums) {
        int count = nums[0];
        int ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                count += nums[i];
            } else {
                count = nums[i];
            }
            
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
}
