class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new ArrayList();
        for (int i = left; i <= right; i++) {
            if (check(i) == true) {
                ret.add(i);
            }
        }
        return ret;
    }
    
    private boolean check(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x = x / 10;
            if (d == 0 || (n % d) > 0) return false;
        }
        return true;
    }
}
