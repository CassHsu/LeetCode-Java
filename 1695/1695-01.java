class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        
        int[] prefixSum = new int[n + 1];
        
        int result = 0, start = 0;
        for (int end = 0; end < n; end++) {
            int curr = nums[end];
            prefixSum[end + 1] = prefixSum[end] + curr;
            
            if (m.containsKey(curr)) {
                start = Math.max(start, m.get(curr) + 1);
            }
            
            result = Math.max(result, prefixSum[end + 1] - prefixSum[start]);
            m.put(curr, end);
        }
        
        return result;
    }
}
