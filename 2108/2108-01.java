class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        
        for (String w: words) {
            if (isPalindrome(w)) {
                ans = w;
                break;
            }
        }
        
        return ans;
    }
    
    private boolean isPalindrome(String w) {
        int i = 0;
        int j = w.length() - 1;
        
        while (i < j) {
            if (w.charAt(i) != w.charAt(j)) {
                return false;   
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}
