class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        
        if (lenS1 > lenS2) return false;
        
        int[] countS1 = new int[26];
        for (int i = 0; i < lenS1; i++) {
            countS1[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i <= lenS2 - lenS1; i++) {
            int[] countS2 = new int[26];
            for (int j = 0; j < lenS1; j++) {
                countS2[s2.charAt(i + j) - 'a']++;
            }
            
            if (match(countS1, countS2)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean match(int[] c1, int[] c2) {
        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}
