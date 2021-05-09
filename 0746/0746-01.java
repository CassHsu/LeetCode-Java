class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length + 1;
        int[] mincost = new int[size];
        
        for (int i = 2; i < size; i++) {
            int step1 = mincost[i-1] + cost[i-1];
            int step2 = mincost[i-2] + cost[i-2];
            
            mincost[i] = Math.min(step1, step2);
        }
        return mincost[size-1];
    }
}
