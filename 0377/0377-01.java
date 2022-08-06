class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for (int s = 1; s < target + 1; s++) {
            for (int n: nums) {
                if (s - n >= 0) {
                    dp[s] += dp[s - n];
                }
            }
        }
        
        return dp[target];
    }
}
