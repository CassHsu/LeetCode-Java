class Solution {
    public boolean checkString(String s) {
        int a = 0;
        int b = s.length();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a = i;
            } else if (b == s.length()) {
                b = i;
            }
        }
        
        return a <= b;
    }
}
