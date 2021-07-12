class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        long m, curr;
        
        while (l <= r) {
          m = l + (r - l) / 2;
          curr = m * (m + 1) / 2;

          if (curr == n) return (int) m;

          if (n < curr) {
            r = m - 1;
          } else {
            l = m + 1;
          }
        }
        return (int) r;
    }
}
