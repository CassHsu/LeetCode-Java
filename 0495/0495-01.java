class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = duration;
        
        for (int i = 1; i < timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i - 1];
            
            count += duration;
            if (diff < duration) {
                count -= duration - diff;
            }
        }
        
        return count;
    }
}
