class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            Integer v = m.get(k);
            
            if (v != null) m.put(k, v + 1);
            else m.put(k, 1);
        }
        
        int num = m.get(s.charAt(0));
        for (Integer v: m.values())
            if (num != v) return false;
        
        return true;
    }
}
