class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;
        
        HashSet<Character> sp = new HashSet<>();
        HashSet<String> sw = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            sp.add(pattern.charAt(i));
            sw.add(words[i]);
        }
        
        if (sp.size() != sw.size()) return false;
        
        HashMap<Character, String> mp = new HashMap<>();
        HashMap<String, Character> ms = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];
            
            if (mp.containsKey(p) == false) {
                mp.put(p, w);
            } else {
                if (!w.equals(mp.get(p))) return false;
            }
            
            if (ms.containsKey(w) == false) {
                ms.put(w, p);
            } else {
                if (ms.get(w) != p) return false;
            }
        }
        return true;
    }
}
