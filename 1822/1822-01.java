class Solution {
    public int arraySign(int[] nums) {
        double p = 1;
        for (int n: nums) {
            p *= (double) n;
        }
        return signFunc(p);
    }
    
    private int signFunc(double p) {
        if (p > 0) return 1;
        else if (p < 0) return -1;
        else return 0;
    }
}
