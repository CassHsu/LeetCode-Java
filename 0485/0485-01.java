class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int count = 0;
        
        for (int n: nums) {
            if (n == 1) count++;
            else count = 0;
            
            if (count > max1) max1 = count;
        }
        return max1;
    }
}
