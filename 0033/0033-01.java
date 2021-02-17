class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while (start <= end) {
            if (nums[start] == target) return start;
            if (nums[end] == target) return end;
            
            mid = (start + end) / 2;
            
            if (nums[mid] == target) return mid;
            
            if (target > nums[start] && nums[mid] > target) {
                end = mid - 1;
            } else if (target > nums[mid] && nums[end] > target) {
                start = mid + 1;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}