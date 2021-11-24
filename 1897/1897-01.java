class Solution {
    public boolean makeEqual(String[] words) {
        final int n = words.length;
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (String w: words) {
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                if (m.containsKey(c)) {
                    m.put(c, m.get(c) + 1);
                } else {
                    m.put(c, 1);
                }
            }
        }
        
        for (Integer v: m.values()) {
            if (v % n != 0) return false;
        }
        
        return true;
    }
}
