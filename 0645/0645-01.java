class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int n: nums) {
            if (m.containsKey(n)) m.put(n, m.get(n) + 1);
            else m.put(n, 1);
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (m.containsKey(i)) {
                if (m.get(i) == 2) ans[0] = i;
            } else {
                ans[1] = i;
            }
        }
        
        return ans;
    }
}
