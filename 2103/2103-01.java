class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> m = new HashMap<>();
        
        for(int i = 0, j = 1; j < rings.length(); i += 2, j += 2) {
            Set<Character> s = null;
            char c = rings.charAt(j);
            if(m.containsKey(c)) {
                s = m.get(c);
            }
            else {
                s = new HashSet<>();
            }
            s.add(rings.charAt(i));
            m.put(c, s);
        }
        
        int count = 0;
        for(Set<Character> s : m.values()) {
            if(s.size() > 2) count++;
        }
        return count;
    }
}
