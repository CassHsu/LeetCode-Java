class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int n = findIndexOfMin(nums);
            nums[n] *= multiplier;
        }

        return nums;
    }

    private int findIndexOfMin(int[] nums) {
        int minIndex = 0;
        int minValue = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
