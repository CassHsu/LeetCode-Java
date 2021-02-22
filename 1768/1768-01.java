class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();
        int w1 = s1;
        int w2 = s2;
        int i = 0;
        StringBuffer ret = new StringBuffer();
        
        while (w1 > 0 && w2 > 0) {
            ret.append(word1.charAt(i));
            ret.append(word2.charAt(i));
            i++;
            w1--;
            w2--;
        }
        
        if (w1 > 0) {
            while (i < s1) {
                ret.append(word1.charAt(i));
                i++;
            }
        } else {
            while (i < s2) {
                ret.append(word2.charAt(i));
                i++;
            }
        }
        
        return ret.toString();
    }
}
