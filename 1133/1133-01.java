class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> singles = new ArrayList<>();
        
        int n = -1;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            if (m.containsKey(n)) m.put(n, m.get(n) + 1);
            else m.put(n, 1);
        }
        
        for (Map.Entry<Integer, Integer> e: m.entrySet()) {
            if (e.getValue() == 1) singles.add(e.getKey());
        }
        
        return singles.size() > 0 ? Collections.max(singles) : -1;
    }
}
