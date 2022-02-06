class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int n1: nums1) {
            for (int n2: nums2) {
                int n = n1 + n2;
                if (m.containsKey(n)) {
                    m.put(n, m.get(n) + 1);
                } else {
                    m.put(n, 1);
                }
            }
        }
        
        for (int n3: nums3) {
            for (int n4: nums4) {
                int n = -(n3 + n4);
                if (m.containsKey(n)) {
                    count += m.get(n);
                }
            }
        }
        
        return count;
    }
}
