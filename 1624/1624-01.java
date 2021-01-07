class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> m = new HashMap();
        int ans = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (m.get(c) == null) {
                m.put(c, i);
            } else {
                ans = Math.max(ans, i - m.get(c) - 1);
            }
        }
        return ans;
    }
}