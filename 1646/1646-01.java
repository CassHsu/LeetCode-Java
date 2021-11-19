class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        
        int m = (n + 1) / 2;
        int max = 1;
        for (int i = 1; i < m; i++) {
            int ii = i * 2;
            dp[ii] = dp[i];
            dp[ii + 1] = dp[i] + dp[i + 1];
            
            if (dp[ii + 1] > max) max = dp[ii + 1];
        }
        
        return max;
    }
}
