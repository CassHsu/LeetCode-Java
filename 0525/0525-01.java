class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        int count = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count += 1;
            else
                count -= 1;
            
            if (m.containsKey(count)) {
                ans = Math.max(ans, i - m.get(count));
                
            } else {
                m.put(count, i);
            }
        }
        
        return ans;
    }
}
