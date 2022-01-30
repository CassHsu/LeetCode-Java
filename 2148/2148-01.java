import java.util.Arrays;

class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        
        for (int n: nums) {
            if (max > n && n > min) count++;   
        }
        
        return count;
    }
}
