class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        
        int r = 0;
        int l = nums.length;
        
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                r = Math.max(r, i);
                l = Math.min(l, i);
            }
        }
        return r - l > 0 ? r - l + 1 : 0;
    }
}
