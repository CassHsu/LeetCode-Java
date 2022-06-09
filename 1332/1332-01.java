class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (s.equals(sb.toString())) return 1;
        
        return 2;
    }
}
