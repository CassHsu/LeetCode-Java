class Solution {
    private int ans = 0;
    private void back(int[] nums, int index, int x) {
        ans += x;
        for (int i = index; i < nums.length; i++) {
            x ^= nums[i];
            back(nums, i + 1, x);
            x ^= nums[i];
        }
    }
    
    public int subsetXORSum(int[] nums) {
        back(nums, 0, 0);
        return ans;
    }
}
