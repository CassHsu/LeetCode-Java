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
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0)) {
                return false;
            }
        }
        return true;
    }
}
