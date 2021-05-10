class Solution {
    private HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    public int minCostClimbingStairs(int[] cost) {
        return mincost(cost.length, cost);
    }
    
    private int mincost(int i, int[] cost) {
        if (i <= 1) return 0;
        if (cache.containsKey(i)) return cache.get(i);
        
        int step1 = cost[i-1] + mincost(i-1, cost);
        int step2 = cost[i-2] + mincost(i-2, cost);
        cache.put(i, Math.min(step1, step2));
        return cache.get(i);
    }
}
