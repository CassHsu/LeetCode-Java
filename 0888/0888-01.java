class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0;
        int sb = 0;
        int[] ret = new int[2];
        
        for (int a: aliceSizes) {
            sa += a;
        }
        
        for (int b: bobSizes) {
            sb += b;
        }
        
        int t = (sa - sb) / 2;
        
        for (int i=0; i<aliceSizes.length; i++) {
            for (int j=0; j<bobSizes.length; j++) {
                if (aliceSizes[i] == bobSizes[j]+ t) {
                    ret[0] = aliceSizes[i];
                    ret[1] = bobSizes[j];
                    return ret;
                }
            }    
        }
        
        return ret;
    }
}
