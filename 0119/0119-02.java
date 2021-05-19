class Solution {
    public List<Integer> getRow(int rowIndex) {
        int i = rowIndex;
        if (i == 0) return Arrays.asList(1);
        if (i == 1) return Arrays.asList(1, 1);
        
        List<Integer> last = getRow(i-1);
        List<Integer> row = new ArrayList<>(Arrays.asList(1));
        for (int j = 0; j < last.size() - 1; j++) {
            row.add(last.get(j) + last.get(j + 1));
        }
        row.add(1);
        return row;
    }
}
