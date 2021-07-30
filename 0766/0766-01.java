class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (!m.containsKey(r - c))
                    m.put(r - c, matrix[r][c]);
                else if (m.get(r - c) != matrix[r][c])
                    return false;
            }
        }
        
        return true;
    }
}
