class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> ms = new HashMap<>();
        HashMap<Character, Integer> mt = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (ms.containsKey(s.charAt(i)) == false) ms.put(s.charAt(i), i);
            if (mt.containsKey(t.charAt(i)) == false) mt.put(t.charAt(i), i);
            
            if (ms.get(s.charAt(i)) != mt.get(t.charAt(i))) return false;
        }
        return true;
    }
}
