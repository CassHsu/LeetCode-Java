class Solution {
    public int buyChoco(int[] prices, int money) {
        int res = money;
        int step = 0;
        int size = prices.length;
        Arrays.sort(prices);

        for (int i = 0; i < size; i++) {
            int p = prices[i];
            if (p <= res) {
                res -= p;
                step += 1;

                if (step == 2) return res;
            } else return money;
        }
        return money;
    }
}
