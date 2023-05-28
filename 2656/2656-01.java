class Solution {
    public int maximizeSum(int[] nums, int k) {
        int ans = 0;
        int mx = 0;
        for (int n: nums) {
            if (n > mx) mx = n;
        }

        for (int i = 0; i < k; i++) {
            ans += mx;
            ans += i;
        }

        return ans;
    }
}
