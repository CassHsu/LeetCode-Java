class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int n: nums1) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        
        for (int n: nums2) {
            if (m.containsKey(n) && m.get(n) > 0) {
                res.add(n);
                m.put(n, m.get(n) - 1);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}