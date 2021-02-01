class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = 0;
        int left = nums.length;
        while (right != left) {
            int mid = (right + left) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) right = mid + 1;
            else left = mid;
        }
        return left;
    }
}