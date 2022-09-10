class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? (b[1] - a[1]) : a[0] - b[0]);
        
        int weaks = 0;
        int mxD = 0;
        for (int i = properties.length - 1; i >= 0; i--) {
            if (properties[i][1] < mxD) {
                weaks++;
            }
            
            mxD = Math.max(mxD, properties[i][1]);
        }
        
        return weaks;
    }
}
