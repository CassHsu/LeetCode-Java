class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int s = 0;
        for (int n: nums) {
            if (n % 2 == 0) {
                s += n;
            }
        }
        
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0];
            int j = queries[i][1];
            
            if (nums[j] % 2 == 0) {
                s -= nums[j];
            }
            
            nums[j] += k;
            
            if (nums[j] % 2 == 0) {
                s += nums[j];
            }
            
            ans[i] = s;
        }
        
        return ans;
    }
}
