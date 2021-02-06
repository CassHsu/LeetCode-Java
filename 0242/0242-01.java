class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        
        String[] sArray = s.split("");
        String[] tArray = t.split("");
        
        for (String c: sArray) {
            if (m.get(c) == null) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c) + 1);
            }
        }
        
        for (String c: tArray) {
            if (m.get(c) == null) {
                return false;
            } else {
                m.put(c, m.get(c) - 1);
            }
        }
        
        for (Integer v: m.values()) {
            if (v != 0) return false;
        }
        
        return true;
    }
}