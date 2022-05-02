class Solution {
    public boolean backspaceCompare(String s, String t) {
        String rs = this.buildit(s);
        String rt = this.buildit(t);
        return rs.equals(rt);
    }
    
    private String buildit(String st) {
        Stack<Character> r = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == '#') {
                if (r.size() > 0) {
                    r.pop();
                }
            } else {
                r.push(c);
            }
        }
        
        return r.toString();
    }
}
