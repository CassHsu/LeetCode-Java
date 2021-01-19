class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (Integer n: nums) {
            if (m.containsKey(n)) return true;
            m.put(n, 1);
        }
        return false;
    }
}