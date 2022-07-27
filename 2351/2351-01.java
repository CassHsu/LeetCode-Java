class Solution {
    public char repeatedCharacter(String s) {
        Character r = s.charAt(0);
        HashSet<Character> cs = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (cs.contains(c)) {
                r = c;
                break;
            }
            cs.add(c);
        }
        
        return r;
    }
}
