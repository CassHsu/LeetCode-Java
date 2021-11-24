class Solution {
    public boolean makeEqual(String[] words) {
        final int n = words.length;
        int[] counts = new int[26];
        
        for (String w: words) {
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                counts[c - 'a']++;
            }
        }
        
        for (int c: counts) {
            if (c % n != 0) return false;
        }
        
        return true;
    }
}
