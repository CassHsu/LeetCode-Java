class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_prof = 0;
        
        for (int p: prices) {
            min_price = Math.min(min_price, p);
            max_prof = Math.max(max_prof, p - min_price);
        }
        
        return max_prof;
    }
}
