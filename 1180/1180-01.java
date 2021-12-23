class Solution {
    public int countLetters(String s) {
        int count = 1;
        int dp = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) dp++;
            else dp = 1;
            
            count += dp;
        }
        
        return count;
    }
}
