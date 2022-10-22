class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int min = Math.min(a, b);
        
        for (int n = 2; n <= min; n++) {
            if (a % n == 0 && b % n == 0) {
                count++;
            }
        }
        
        return count;
    }
}
