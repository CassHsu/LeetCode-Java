class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int pn = p.length();
        int sn = s.length();
        
        if (sn < pn) return ans;
        
        int[] pa = new int[26];
        int[] sa = new int[26];
        
        char a = 'a';
        for (int i = 0; i < pn; i++) {
            pa[p.charAt(i) - a] += 1;
        }
        
        for (int i = 0; i < sn; i++) {
            sa[s.charAt(i) - a] += 1;
            
            if (i >= pn) {
                sa[s.charAt(i - pn) - a] -= 1;
            }
            
            if (isEqual(pa, sa)) ans.add(i - pn + 1);
        }
        
        return ans;
    }
    
    private boolean isEqual(int[] pa, int[] sa) {
        for (int i = 0; i < 26; i++) {
            if (pa[i] != sa[i]) return false;
        }
        
        return true;
    }
}
