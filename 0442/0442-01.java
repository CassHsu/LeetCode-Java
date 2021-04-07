class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        
        for (int n: nums) {
            if (m.get(n) == null) {
                m.put(n, 1);
            } else {
                if (m.get(n) == 1) {
                    ret.add(n);
                }
                m.put(n, m.get(n) + 1);
            }
        }
        return ret;
    }
}
