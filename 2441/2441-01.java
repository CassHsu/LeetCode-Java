class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int n: nums) {
            if (m.containsKey(n)) m.put(n, m.get(n) + 1);
            else m.put(n, 1);
        }
        
        for (int n: nums) {
            if (n > 0 && m.containsKey(-n) && n > max) {
                max = n;
            }    
        }
        
        return max;
    }
}
