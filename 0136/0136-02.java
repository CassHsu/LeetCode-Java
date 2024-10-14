class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                sum -= num;
            } else {
                seen.add(num);
                sum += num;
            }
        }
        return sum;
    }
}
