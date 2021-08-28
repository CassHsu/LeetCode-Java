class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        
        for (int n: nums) {
            if (n < small) {
                small = n;   
            } else if (n > large) {
                large = n;
            }
        }
        
        return gcd(large, small);
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
