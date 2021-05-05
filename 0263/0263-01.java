class Solution {
    public boolean isUgly(int n) {
        if (n == 0) return false;
        
        int[] ugly = new int[] {2, 3, 5};
        for (int u: ugly) {
            while (n % u == 0) {
                n /= u;
            }
        }
        return n == 1;
    }
}
