class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean changed = false;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) continue;
            if (changed == true) return false;
            
            if (i == 1 || nums[i] >= nums[i - 2]) nums[i - 1] = nums[i];
            else nums[i] = nums[i - 1];
            
            changed = true;
        }
        
        return true;
    }
}
