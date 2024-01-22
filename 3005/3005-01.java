class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int max = 0;
        int count = 0;

        for (int n: nums) {
            int f = m.getOrDefault(n, 0) + 1;
            if (f == max) count++;
            else if (f > max) {
                max = f;
                count = 1;
            }
            m.put(n, f);
        }

        return max * count;
    }
}
