class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[c++] = nums[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                ans[c++] = nums[i];
            }
        }
        
        return ans;
    }
}
