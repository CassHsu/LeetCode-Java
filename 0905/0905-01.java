class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        Integer[] nums2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = nums[i];
        }
        
        Arrays.sort(nums2, (a, b) -> Integer.compare(a % 2, b % 2));
        for (int i = 0; i < n; i++) {
            nums[i] = nums2[i];
        }
        
        return nums;
    }
}
