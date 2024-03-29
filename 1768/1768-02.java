class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0;

        while (i < w1 || i < w2) {
            if (i < w1) sb.append(word1.charAt(i));
            if (i < w2) sb.append(word2.charAt(i));
            i++;
        }

        return sb.toString();
    }
}
