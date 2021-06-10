class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = arr;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i+1];
            for (int j = i + 2; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            res[i] = max;
        }
        
        res[arr.length - 1] = -1;
        return res;
    }
}
