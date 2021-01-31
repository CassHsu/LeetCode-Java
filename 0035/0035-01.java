class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        if (target > nums[size - 1]) return size;
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] >= target) {
                res = i;
                break;
            }
        }
        return res;
    }
}