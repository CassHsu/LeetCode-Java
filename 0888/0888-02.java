class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ret = new int[2];
        Set<Integer> setA = new HashSet<>();
        
        int sa = 0;
        int sb = 0;
        
        for (int a: aliceSizes) {
            sa += a;
            setA.add(a);
        }
        
        for (int b: bobSizes) {
            sb += b;
        }
        
        int t = (sb - sa) >> 1;
        for (int b: bobSizes) {
            if (setA.contains(b - t)) {
                ret[0] = b - t;
                ret[1] = b;
                return ret;
            }
        }
        
        return ret;
    }
}
