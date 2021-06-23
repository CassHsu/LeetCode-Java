class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int pv = arr[0];
        int pi = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > pv) {
                pv = arr[i];
                pi = i;
            }
        }
        
        return pi;
    }
}
