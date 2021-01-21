class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (m.get(c) == 1) return i;
        }
        return -1;
    }
}