class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        
        ArrayList<Character> stack = new ArrayList<>();
        HashMap<Character, Character> m = new HashMap<>();
        m.put('(', ')');
        m.put('[', ']');
        m.put('{', '}');
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int size = stack.size();
            if (size > 0 && c.equals(m.get(stack.get(size - 1)))) {
                stack.remove(size - 1);
            } else {
                stack.add(c);
            }
        }
        
        return stack.size() == 0;
    }
}
