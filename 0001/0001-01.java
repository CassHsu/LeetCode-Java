class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (m.get(find) != null) {
                ans[0] = m.get(find);
                ans[1] = i;
                break;
            }
            
            m.put(nums[i], i);
        }
        
        return ans; 
    }
}
