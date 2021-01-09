class Solution {
    public boolean isPowerOfTwo(int n) {
        int p = 1;
        for (int i = 0; i < 31; i++) {
            if (n == p) return true;
            p *= 2;
        }
        
        return false;
    }
}