class Solution {
    public int strStr(String haystack, String needle) {
        int nSize = needle.length();
        int hSize = haystack.length();
        
        if (nSize == 0 || haystack.equals(needle)) return 0;
        
        int diff = hSize - nSize;
        int p = 0;
        while (p <= diff) {
            if (needle.equals(haystack.substring(p, p + nSize))) {
                return p;
            } else {
                p++;
            }
        }
        return -1;
    }
}