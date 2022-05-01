class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < keyboard.length(); i++) {
            m.put(keyboard.charAt(i), i);
        }
        
        int count = 0;
        int curr = 0;
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            count += Math.abs(m.get(w) - curr);
            curr = m.get(w);
        }
        
        return count;
    }
}
