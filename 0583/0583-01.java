class Solution {
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[] dp = new int[n2 + 1];
        
        for (int i = 0; i <= n1; i++) {
            int[] tmp = new int[n2 + 1];
            
            for (int j = 0; j <= n2; j++) {
                if (i == 0 || j == 0) {
                    tmp[j] = i + j;
                    
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    tmp[j] = dp[j - 1];
                    
                } else {
                    tmp[j] = 1 + Math.min(dp[j], tmp[j - 1]);
                }
            }
            
            dp = tmp;
        }
        
        return dp[n2];
    }
}
