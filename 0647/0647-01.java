class Solution {
    private int count = 0;
    private int size = 0;
    
    private void towpointers(String s, int l, int r) {
        while (l >= 0 && r < this.size && s.charAt(l) == s.charAt(r)) {
            this.count++;
            l--;
            r++;
        }
    }
    
    public int countSubstrings(String s) {
        this.size = s.length();
        
        for (int i = 0; i < this.size; i++) {
            this.towpointers(s, i, i);
            this.towpointers(s, i, i + 1);
        }
        
        return this.count;
    }
}
