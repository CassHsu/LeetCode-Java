class Solution {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();
        if (size < 26) return false;
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            m.put(alphabet.charAt(i), 0);
        }
        
        for (int i = 0; i < size; i++) {
            char c = sentence.charAt(i);
            m.put(c, m.get(c) + 1);
        }
        
        for (Integer v: m.values()) {
            if (v == 0) return false;
        }
        
        return true;
    }
}
