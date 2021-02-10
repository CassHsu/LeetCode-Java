class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int offset = 30; offset >= 0; offset--) {
                int mask = 1 << offset;
                if ((i & mask) > 0) {
                    count++;
                }
            }
            ret[i] = count;
        }
        return ret;
    }
}