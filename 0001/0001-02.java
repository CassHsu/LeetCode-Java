class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (m.containsKey(find)) {
                return new int[] {m.get(find), i};
            }

            m.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
