class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> ms = new HashMap<>();
        HashMap<Character, Integer> mt = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ms.containsKey(c)) {
                ms.put(c, ms.get(c) + 1);
            } else {
                ms.put(c, 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (mt.containsKey(c)) {
                mt.put(c, mt.get(c) + 1);
            } else {
                mt.put(c, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> p: mt.entrySet()) {
            if (!ms.containsKey(p.getKey()) || ms.get(p.getKey()) != p.getValue()) return p.getKey();
        }
        
        return t.charAt(0);
    }
}
