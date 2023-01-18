class Solution {
    public int maximumCount(int[] nums) {
        int p = 0;
        int n = 0;

        for (int num: nums) {
            if (num > 0) {
                p++;
                continue;
            }
            if (num < 0) { 
                n++;
                continue;
            }
        }

        return Math.max(p, n);
    }
}
