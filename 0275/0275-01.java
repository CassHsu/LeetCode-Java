class Solution {
    public int hIndex(int[] citations) {
        int size = citations.length;
        for (int h = size; h > 0; h--) {
            int i = size - h;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
