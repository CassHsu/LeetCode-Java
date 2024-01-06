class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int size = s.length;
        if (size == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s); 

        int ans = 0;
        int si = size - 1;
        int gi = g.length - 1;
        while (si >= 0 && gi >= 0) {
            if (s[si] >= g[gi]) {
                ans++;
                si--;
                gi--;
            } else {
                gi--;
            }
        }
        return ans;
    }
}
