class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size <= 1) return size;
        int p = 0;
        for (int i = 1; i < size; i++) {
            if (nums[i] != nums[p]) {
                p += 1;
                nums[p] = nums[i];
            }
        }
        return p + 1;
    }
}