class Solution {
    public boolean rotateString(String s, String goal) {
        if ("".equals(s) && "".equals(goal)) return true;
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        
        List<String> lg = Arrays.asList(goal.split(""));
        int size = s.length();
        for (int i = 0; i < size; i++) {
            Collections.rotate(lg, 1);
            String sg = String.join("", lg);
            if (s.equals(sg)) return true;
        }
        return false;
    }
}
