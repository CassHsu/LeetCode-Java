class Solution {
    public char findTheDifference(String s, String t) {
        int size = s.length();
        char r = t.charAt(size);
        for (int i = 0; i < size; i++) {
            r ^= s.charAt(i) ^ t.charAt(i);
        }
        return r;
    }
}
