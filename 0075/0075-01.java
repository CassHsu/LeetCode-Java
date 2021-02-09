class Solution {
    public void sortColors(int[] nums) {
        boolean isConti = true;
        int stop = 1;
        while (isConti) {
            isConti = false;
            int count = nums.length - stop;
            for (int i = 0; i < count; i++) {
                if (nums[i] > nums[i+1]) {
                    int tmp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = tmp;
                    isConti = true;
                }
            }
            stop++;
        }
    }
}