class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans = new int[nums.length];

        int ls = 0;
        int rs = 0;
        for(int i: nums) rs += i;

        for(int i = 0; i < nums.length; i++) {
            rs -= nums[i]; 
            ans[i] = Math.abs(ls - rs); 
            ls += nums[i];                   
        }

        return ans;
    }
}
