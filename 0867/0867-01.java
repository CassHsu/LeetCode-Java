class Solution {
    public int[][] transpose(int[][] matrix) {
        int rSize = matrix.length;
        int cSize = matrix[0].length;
        
        int[][] ret = new int[cSize][rSize];
        
        for (int r = 0; r < rSize; r++) {
            for (int c = 0; c < cSize; c++) {
                ret[c][r] = matrix[r][c];
            }
        }
        
        return ret;
    }
}
