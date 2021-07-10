class Solution {
    public int arrangeCoins(int n) {
        long count = 0;
        
        for (int i = 1; i <= n; i++) {
            count += i;
            
            if (count > n) {
                return i - 1;
            } else if (n == count) {
                return i;
            }
        }
        
        return 0;
    }
}
