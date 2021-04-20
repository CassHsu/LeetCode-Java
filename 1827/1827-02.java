class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] >= nums[i]) {
                int diff = nums[i-1] - nums[i];
                diff++;
                count += diff;
                nums[i] += diff;
            }
        }
        return count;
    }
}
