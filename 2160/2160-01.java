import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] nums = {0, 0, 0, 0};
        
        for (int i = 0; i < 4; i++) {
            nums[i] = num % 10;
            num = num / 10;
        }
        
        Arrays.sort(nums);
        
        int n1 = nums[0] * 10 + nums[2];
        int n2 = nums[1] * 10 + nums[3];
        return n1 + n2;
    }
}
