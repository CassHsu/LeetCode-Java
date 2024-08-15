class Solution {
    public boolean canAliceWin(int[] nums) {
        int s = 0;
        int d = 0;

        for (int n: nums) {
            if (String.valueOf(n).length() == 1) {
                s += n;
            } else {
                d += n;
            }
        }

        return s != d;
    }
}
