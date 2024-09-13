class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int newIdx = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newIdx]) {
                newIdx++;
                nums[newIdx] = nums[i];
            }
        }

        return newIdx + 1;
    }
}
