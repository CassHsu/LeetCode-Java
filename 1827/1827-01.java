class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int prev = 0;
        
        for (int n: nums) {
            if (prev >= n) {
                prev++;
                count += prev - n;
            } else {
                prev = n;
            }
        }
        
        return count;
    }
}
