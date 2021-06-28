class Solution {
    public int minCostToMoveChips(int[] position) {
        int even_cnt = 0;
        int odd_cnt = 0;
        
        for (int v: position) {
            if (v % 2 == 0) even_cnt++;
            else odd_cnt++;
        }
        
        return Math.min(even_cnt, odd_cnt);
    }
}
