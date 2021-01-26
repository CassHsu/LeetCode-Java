class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int size = prices.length;
        for (int i = 1; i < size; i++) {
            int pf = prices[i] - prices[i-1];
            if (pf > 0) res += pf;
        }
        return res;
    }
}