class Solution {
    public boolean isPowerOfThree(int n) {
        int p = 1;
        for (int i = 0; i < 31; i++) {
            if (p == n) return true;
            p *= 3;
        }
        return false;
    }
}