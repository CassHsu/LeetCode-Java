class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int l = 0;
        int r = mat.length - 1;
        for (int[] m: mat) {
            if (l == r) {
                sum += m[l];
            } else {
                sum += m[l];
                sum += m[r];
            }
            
            l++;
            r--;
        }
        
        return sum;
    }
}
