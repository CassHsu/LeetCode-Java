class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        Double ans = Double.MAX_VALUE;
        Double avg = 0.0; 
        int i = 0;
        int j = size - 1;

        while (i <= j) {
            avg =  ((double)nums[i] + (double)nums[j])/ 2.0;
            ans = Math.min(ans, avg);
            i += 1;
            j -= 1;
        }

        return ans;
    }
}
