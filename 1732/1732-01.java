class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int last = 0;
        for (int g: gain) {
            last = last + g;
            if (last > max) max = last;
        }
        return max;
    }
}
