class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                row.add(1);
            }
            
            if (i > 0) {
                List<Integer> last = ret.get(i-1);
                for (int j = 1; j < i; j++) {
                    row.set(j, last.get(j-1) + last.get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
