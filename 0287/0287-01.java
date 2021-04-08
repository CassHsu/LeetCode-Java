class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (true) {
            fast = nums[fast];
            fast = nums[fast];
            slow = nums[slow];
            
            if (slow == fast) {
                slow = 0;
                break;
            }
        }
        
        while (true) {
            fast = nums[fast];
            slow = nums[slow];
            
            if (slow == fast) return slow;
        }
    }
}
