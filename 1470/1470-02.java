class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 0);

        int j = 0;
        int k = n;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = (i % 2 == 0) ? nums[j++] : nums[k++];
        }

        return ans; 
    }
}
