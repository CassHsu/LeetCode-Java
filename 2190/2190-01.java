class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> m = new HashMap();
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key) {
                if (m.containsKey(nums[i])) {
                    m.put(nums[i], (Integer) m.get(nums[i]) + 1);
                } else {
                    m.put(nums[i], 1);
                }
            }
        }
        
        Integer ans = nums[0];
        Integer max = 0;
        
        for (Map.Entry<Integer, Integer> pair: m.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                ans = pair.getKey();
            }
        }
        
        return ans;
    }
}
