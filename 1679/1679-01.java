class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int c = k - n;
            
            if (m.getOrDefault(n, 0) > 0 && m.getOrDefault(c, 0) > 0) {
                if ((n == c) && m.get(n) < 2)
                    continue;
                
                m.put(n, m.get(n) - 1);
                m.put(c, m.get(c) - 1);
                count++;
            }
        }
        
        return count;
    }
}
