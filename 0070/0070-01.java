class Solution {
    public int climbStairs(int n) {
        int cache[] = new int[n + 1];
        return climb1or2(0, n, cache);
    }
    
    public int climb1or2(int i, int n, int cache[]) {
        if (i > n) return 0;
        if (i == n) return 1;
        
        if (cache[i] > 0) return cache[i];
        
        cache[i] = climb1or2(i+1, n, cache) + climb1or2(i+2, n, cache);
        
        return cache[i];
    }
}
