class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int s1 = 0;
        int s2 = 0;
        
        for (int i = 2; i <= cost.length; i++) {
            int tmp = s1;
            s1 = Math.min(s1 + cost[i-1], s2 + cost[i-2]);
            s2 = tmp;
        }
        return s1;
    }
}
