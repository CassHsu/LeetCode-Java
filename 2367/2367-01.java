class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> s = new HashSet<>();

        for (int n: nums) {
            if (s.contains(n - diff) && s.contains(n - diff - diff)) {
                count++;
            }

            s.add(n);
        }
        return count;
    }
}
