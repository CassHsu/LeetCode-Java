class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (Integer n: nums) {
            Integer v = m.get(n);
            if (v == null) {
                m.put(n, 1);
            } else {
                m.put(n, v + 1);
            }
        }
        
        for (Integer k: m.keySet()) {
            if (m.get(k) == 1) {
                ans += k;
            }
        }
        
        return ans;
    }
}
