class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] counts = new int[26];
        
        char a = 'a';
        for (int i = 0; i < word1.length(); i++) {
            counts[word1.charAt(i) - a]++;
        }
        
        for (int i = 0; i < word2.length(); i++) {
            counts[word2.charAt(i) - a]--;
        }
        
        for (int c: counts) {
            if (c > 3 || c < -3) return false;
        }
        
        return true;
    }
}
