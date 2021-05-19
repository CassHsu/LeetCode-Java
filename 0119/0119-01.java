class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ret = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
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
        return ret.get(rowIndex);
    }
}
