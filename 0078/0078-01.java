class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<Integer>());
        
        for (int n: nums) {
            int len = ret.size();
            for (int i = 0; i < len; i++) {
                List<Integer> ss = new ArrayList<Integer>(ret.get(i));
                ss.add(n);
                ret.add(ss);
            }
        }
        return ret;
    }
}
