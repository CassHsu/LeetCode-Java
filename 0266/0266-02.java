class Solution {
    public boolean canPermutePalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (char k: m.keySet()) {
            count += m.get(k) % 2;
        }
        
        return count <= 1;
    }
}
